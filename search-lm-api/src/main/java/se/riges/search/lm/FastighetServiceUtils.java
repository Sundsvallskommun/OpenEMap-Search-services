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
import java.io.Writer;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import net.opengis.gml._3.AbstractGeometryType;
import net.opengis.gml._3.GeometryPropertyType;
import net.opengis.gml._3.ObjectFactory;
import net.opengis.gml._3.PointType;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.node.JsonNodeFactory;
import org.codehaus.jackson.node.ObjectNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.wololo.geojson.FeatureCollection;
import org.wololo.geojson.Feature;
import org.wololo.jts2geojson.GeoJSONWriter;

import se.lantmateriet.namespace.distribution.produkter.fastighet.v1.*;
import se.riges.lm.rmi.exceptions.LMAccountException;

import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.operation.union.UnaryUnionOp;

/**
 * Utility class for various predefined usage patterns against LM FastighetService
 * 
 * <p>TODO: break out conversion to separate class</p>
 */
public class FastighetServiceUtils extends ServiceUtils {
	static final Logger LOG = LoggerFactory.getLogger(FastighetServiceUtils.class);
	
	static FastighetService service = null;
	static final GmlConverter gmlConverter = new GmlConverter();
	static final ObjectFactory objectFactory = new ObjectFactory();
	static final GeoJSONWriter geoJSONWriter = new GeoJSONWriter();
	
	static final JsonNodeFactory factory = JsonNodeFactory.instance;

	static {
		gmlConverter.setSwapAxes(true);
	}
	
	static void initService() {
		if (service == null) {
			URL url = null;
			try {
				url = new URL("http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.5/fastighet-1.5.0.wsdl");
			} catch (MalformedURLException e) {
				throw new RuntimeException(e);
			}
			QName qName = new QName("http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.5", "FastighetService");
			
			service = new FastighetService(url, qName);
			// NOTE: enable next line to trace SOAP XML
			//trace(service);
		}
	}
	
	static FastighetPortType createBinding(String lmUser) throws IOException, LMAccountException {
		initService();
		FastighetPortType binding = service.getFastighetSoapBinding();
		setAuth((BindingProvider) binding, lmUser);
		return binding;
	}
	
	static public Feature findEnhetsomrade(Point point, String lmUser) throws IOException, LMAccountException {
		RegisterenhetsreferensType registerenhetsreferens = findRegisterenhet(point, lmUser);
		String objektidentitet = registerenhetsreferens.getObjektidentitet(); 
		
		RegisterenhetResponseType registerenhetResponse = getRegisterenhet(objektidentitet, lmUser);
		RegisterenhetType registerenhet = registerenhetResponse.getRegisterenhetMember().get(0).getRegisterenhet().getValue();

		for (EnhetsomradeType enhetsomrade : registerenhet.getEnhetsomrade()) {
			for (JAXBElement<? extends AbstractGeometryType> element : enhetsomrade.getYta().getAbstractGeometry()) {
				AbstractGeometryType gml = element.getValue();
				Geometry geometry = gmlConverter.toJtsGeometry(gml);
				if (geometry.contains(point)) {
					Map<String, Object> properties = new HashMap<String, Object>();
					properties.put("name", registerenhetsreferens.getBeteckning());	
					properties.put("fnr", registerenhetsreferens.getFastighetsnyckel());
					Feature feature = new Feature(geoJSONWriter.write(geometry), properties);
					return feature;
				}
			}
		}
		
		throw new RuntimeException("Inga enhetsområden hittades.");
	}
		
	static public RegisterenhetsreferensType findRegisterenhet(Point point, String lmUser) throws IOException, LMAccountException {
		FastighetPortType binding = createBinding(lmUser);
		FindRegisterenhetRequestType request = new FindRegisterenhetRequestType();
		GeometriFilterType filter = new GeometriFilterType();
		PointType pointType = (PointType) gmlConverter.toVendorGeometry(point);
		JAXBElement<PointType> element = objectFactory.createPoint(pointType);
		GeometryPropertyType geometryProperty =  new GeometryPropertyType();
		geometryProperty.setAbstractGeometry(element);
		filter.setGeometri(geometryProperty);
		request.setGeometriFilter(filter);
		RegisterenhetsreferensResponseType response = binding.findRegisterenhet(request);
		
		List<RegisterenhetsreferensType> fastigheter = response.getRegisterenhetsreferens();
		
		if (fastigheter.isEmpty()) {
			throw new RuntimeException("Ingen fastighet hittades.");
		}
		
		return fastigheter.get(0);
	}
	static public JsonNode findRegisterenhetBeteckning(Point point, String lmUser) throws IOException, LMAccountException {
		RegisterenhetsreferensType registerenhetsreferens = findRegisterenhet(point, lmUser);
		
		ObjectNode node = factory.objectNode();
		if (registerenhetsreferens == null) {
			node.put("name", "Inga funna fastigheter");
		} else {
			node.put("name", registerenhetsreferens.getBeteckning());
		}
		
		return node;
	}
	
	static public RegisterenhetResponseType getRegisterenhet(String objektidentitet, String lmUser) throws IOException, LMAccountException {
		FastighetPortType binding = createBinding(lmUser);
		GetRegisterenhetRequestType request = new GetRegisterenhetRequestType();
		RegisterenhetDatasetType includeData = new RegisterenhetDatasetType();
		includeData.setBasinformation(true);
		includeData.setGeometri(true);
		request.setIncludeData(includeData);
		request.getObjektidentitet().add(objektidentitet);
		RegisterenhetResponseType response = binding.getRegisterenhet(request);
		return response;
	}
		
	static public RegisterenhetResponseType getRegisterenhetByFnr(String fnr, String lmUser) throws IOException, LMAccountException {
		FastighetPortType binding = createBinding(lmUser);
		GetRegisterenhetRequestType request = new GetRegisterenhetRequestType();
		RegisterenhetDatasetType includeData = new RegisterenhetDatasetType();
		includeData.setBasinformation(true);
		includeData.setGeometri(true);
		request.setIncludeData(includeData);
		request.getFastighetsnyckel().add(fnr);
		RegisterenhetResponseType response = binding.getRegisterenhet(request);
		return response;
	}
	
	static public Geometry getRegisterenhetGeometry(String objektidentitet, String lmUser) throws IOException, LMAccountException {
		RegisterenhetResponseType registerenhetResponse = getRegisterenhet(objektidentitet, lmUser);
		return getRegisterenhetGeoJSON(registerenhetResponse);
	}
	
	static public Geometry getRegisterenhetGeometryByFnr(String fnr, String lmUser) throws IOException, LMAccountException {

		RegisterenhetResponseType registerenhetResponse = getRegisterenhetByFnr(fnr, lmUser);
		return getRegisterenhetGeoJSON(registerenhetResponse);
	}
	
	static Geometry getRegisterenhetGeoJSON(RegisterenhetResponseType registerenhetResponse) throws IOException, LMAccountException {
		RegisterenhetType registerenhet = registerenhetResponse.getRegisterenhetMember().get(0).getRegisterenhet().getValue();

		List<Geometry> geometries = new ArrayList<Geometry>();
		for (EnhetsomradeType enhetsomrade : registerenhet.getEnhetsomrade()) {
			for (JAXBElement<? extends AbstractGeometryType> element : enhetsomrade.getYta().getAbstractGeometry()) {
				AbstractGeometryType gml = element.getValue();
				Geometry geometry = gmlConverter.toJtsGeometry(gml);
				geometries.add(geometry);
			}
		}
		Geometry geometry = UnaryUnionOp.union(geometries);
		return geometry;
	}
	
	static String calcBeteckning(RegisterenhetType r) {
		RegisterbeteckningType b = r.getRegisterbeteckning();
		return b.getRegisteromrade() + " " + b.getTraktnamn() + " " + ("*".equals(b.getBlock()) ? "" : (b.getBlock() + ":")) + ("*".equals(b.getEnhet()) ? "" : b.getEnhet());
	}
	
	static public FeatureCollection getEnhetsomraden(String objektidentitet, String lmUser) throws IOException, LMAccountException {
		RegisterenhetResponseType registerenhetResponse = getRegisterenhet(objektidentitet, lmUser);
		return getEnhetsomradeGeoJSON(registerenhetResponse, true, false);
	}
	
	static public FeatureCollection getEnhetsomradenByFnr(String fnr, String lmUser) throws IOException, LMAccountException {
		RegisterenhetResponseType registerenhetResponse = getRegisterenhetByFnr(fnr, lmUser);
		return getEnhetsomradeGeoJSON(registerenhetResponse, true, false);
	}
	
	static public FeatureCollection getEnhetsomradenByFnrSingle(String fnr, String lmUser) throws IOException, LMAccountException{
		RegisterenhetResponseType registerenhetResponse = getRegisterenhetByFnr(fnr, lmUser);
		return getEnhetsomradeGeoJSON(registerenhetResponse, false, true);
	}
	
	static FeatureCollection getEnhetsomradeGeoJSON(RegisterenhetResponseType registerenhetResponse, Boolean includeEnhetsomrade, Boolean singleEstate) {
		RegisterenhetType registerenhet = registerenhetResponse.getRegisterenhetMember().get(0).getRegisterenhet().getValue();

		List<Feature> features = new ArrayList<Feature>();
		
		for (EnhetsomradeType enhetsomrade : registerenhet.getEnhetsomrade()) {
			for (JAXBElement<? extends AbstractGeometryType> element : enhetsomrade.getYta().getAbstractGeometry()) {
				AbstractGeometryType gml = element.getValue();
				Geometry geometry = gmlConverter.toJtsGeometry(gml);
				Map<String, Object> properties = new HashMap<String, Object>();
				String beteckning = calcBeteckning(registerenhet);
				if (includeEnhetsomrade)
					beteckning += " Enhetsområde " + enhetsomrade.getOmradesnummer();
				properties.put("name", beteckning);
				Feature feature = new Feature(geoJSONWriter.write(geometry), properties);
				features.add(feature);
				
				if (singleEstate)
					break;
			}
			
			if (singleEstate)
				break;
		}
		
		return geoJSONWriter.write(features);
	}
	
	
}
