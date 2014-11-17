/*
Copyright Härnösands kommun(C) 2014 

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation, either version 3 of the
    License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
    All rights reserved. This program and the accompanying materials
    are made available under the terms of the GNU Affero General Public License
    which accompanies this distribution, and is available at
    http://www.gnu.org/licenses/agpl-3.0.html
 */

package se.riges.search.lm;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import net.opengis.gml.v_3_1_1.profiles.gmlsfprofile.v_1_0_0.PointType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.wololo.geojson.Feature;
import org.wololo.jts2geojson.GeoJSONWriter;

import se.lantmateriet.namespace.distribution.products.placename.v1.FindOrtnamnRequest;
import se.lantmateriet.namespace.distribution.products.placename.v1.FindOrtnamnResponse;
import se.lantmateriet.namespace.distribution.products.placename.v1.FindOrtnamnsreferensRequest;
import se.lantmateriet.namespace.distribution.products.placename.v1.MatchFritextType;
import se.lantmateriet.namespace.distribution.products.placename.v1.MatchModeType;
import se.lantmateriet.namespace.distribution.products.placename.v1.NamntypType;
import se.lantmateriet.namespace.distribution.products.placename.v1.NamntyperType;
import se.lantmateriet.namespace.distribution.products.placename.v1.OrtnamnCriteriaType;
import se.lantmateriet.namespace.distribution.products.placename.v1.OrtnamnType;
import se.lantmateriet.namespace.distribution.products.placename.v1.OrtnamnsplaceringType;
import se.lantmateriet.namespace.distribution.products.placename.v1.Placename;
import se.lantmateriet.namespace.distribution.products.placename.v1.PlacenameService;
import se.riges.lm.rmi.exceptions.LMAccountException;
import se.riges.search.lm.util.Municipality;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Point;

public class PlacenameServiceUtils extends ServiceUtils {
	static final Logger LOG = LoggerFactory.getLogger(PlacenameServiceUtils.class);
	
	static PlacenameService service = null;
	
	static final GeoJSONWriter geoJSONWriter = new GeoJSONWriter();
	
	static void initService() {
		if (service == null) {
			URL url = null;
			try {
				url = new URL("http://namespace.lantmateriet.se/distribution/products/placename/v1/placename-1.1.wsdl");
			} catch (MalformedURLException e) {
				throw new RuntimeException(e);
			}
			QName qName = new QName("http://namespace.lantmateriet.se/distribution/products/placename/v1", "placenameService");
			
			service = new PlacenameService(url, qName);
			// NOTE: enable next line to trace SOAP XML
			// trace(service);
		}
	}
	
	static Placename createBinding(String lmUser) throws IOException, LMAccountException {
		initService();
		Placename binding = service.getPlacenameSoap12();
		setAuth((BindingProvider) binding, lmUser);
		return binding;
	}
	
	static List<Feature> findOrt2(Integer kommunkod, String searchString, String lmUser) throws IOException, LMAccountException {
		Placename binding = createBinding(lmUser);
		
		// NOTE: no option to set max results... results can be very large :(
		// NOTE: FindOrtnamnsreferensRequest (which has max result) cannot be used since it cannot filter on namntyp etc.
		FindOrtnamnRequest findOrtnamnRequest = new FindOrtnamnRequest();
		
		OrtnamnCriteriaType ortnamnCriteriaType = new OrtnamnCriteriaType();
		if (kommunkod != null) {
			ortnamnCriteriaType.setKommunkod(kommunkod % 100);
			ortnamnCriteriaType.setLanskod(kommunkod / 100);
		}
		
		NamntyperType na = new NamntyperType();
		na.getNamntyp().add(NamntypType.BEBTX);
		na.getNamntyp().add(NamntypType.BEBTÄTTX);
		ortnamnCriteriaType.setNamntyper(na);
		MatchFritextType matchFritextType = new MatchFritextType();
		matchFritextType.setMatch(MatchModeType.CONTAINS);
		matchFritextType.setValue(searchString);
		ortnamnCriteriaType.setNamn(matchFritextType);
		ortnamnCriteriaType.setSprak("SV");
		
		findOrtnamnRequest.setOrtnamnCriteria(ortnamnCriteriaType);
		FindOrtnamnResponse response = binding.findOrtnamn(findOrtnamnRequest);
		
		LOG.info("Got response from findOrtnamn (" + response.getTotaltAntal() + " hits)");
		
		List<Feature> features = new ArrayList<Feature>();
		for (OrtnamnType ortnamn : response.getOrtnamn()) {
			Long id = (Long) ortnamn.getRest().get(0).getValue();
			String name = (String) ortnamn.getRest().get(1).getValue();
			OrtnamnsplaceringType ortnamnsplacering = (OrtnamnsplaceringType) ortnamn.getRest().get(3).getValue();
			PointType punkt = ortnamnsplacering.getPunkt();
			double x = punkt.getPos().getValue().get(0);
			double y = punkt.getPos().getValue().get(1);
			Point point = new GeometryFactory().createPoint(new Coordinate(x, y));
			Map<String, Object> properties = new HashMap<String, Object>();
			properties.put("id", id);
			properties.put("name", name);
			if ( kommunkod != null ) {
				Municipality m = new Municipality();
				String kommunNamn =  m.getMunicipalityMap().get(kommunkod);
				properties.put("municipality", kommunNamn);
			}
			else {
				properties.put("municipality",""); 
			}
			features.add(new Feature(geoJSONWriter.write(point), properties));
		}
		
		return features;
	}
	
	static public List<Feature> findOrt(String kommunkod, String searchString, String lmUser) throws IOException, LMAccountException {
		LOG.info("Calling findOrtnamn with search string: " + searchString + " and kommunkod: " + kommunkod);
		
		if (searchString.length()<3) {
			throw new RuntimeException("search string must be longer than 3 chars");
		}
		
		if (kommunkod != null) {
			List<Feature> features = new ArrayList<Feature>();
			String[] kommunkoder = kommunkod.split(",");
			for (String kod : kommunkoder) {
				features.addAll(findOrt2(Integer.parseInt(kod), searchString, lmUser));
			}
			return features;
		} else {
			return findOrt2(null, searchString, lmUser);
		}
	}
}
