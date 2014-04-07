package se.riges.search.lm;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.LinkedList;
import java.util.List;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.wololo.geojson.Feature;
import org.wololo.geojson.FeatureCollection;
import org.wololo.geojson.Geometry;
import org.wololo.geojson.MultiLineString;
import org.wololo.geojson.MultiPolygon;
import org.wololo.geojson.Polygon;

import org.wololo.jts2geojson.GeoJSONWriter;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import se.lantmateriet.namespace.distribution.products.address.v2.FindAdressResponse;
import se.riges.lm.rmi.beans.Address;
import se.riges.lm.rmi.beans.Estate;
import se.riges.lm.rmi.beans.Placename;
import se.riges.lm.rmi.exceptions.LMAccountException;
import se.riges.lm.rmi.exceptions.LMUnavailableException;
import se.riges.lm.rmi.interfaces.IAddress;
import se.riges.lm.rmi.interfaces.IEstate;
import se.riges.lm.rmi.interfaces.IPlacename;

public class FreeTextSearch implements se.riges.lm.rmi.Search {

	static final Logger LOG = LoggerFactory.getLogger(FreeTextSearch.class);
	static final GeoJSONWriter geoJSONWriter = new GeoJSONWriter();
	
	@Override
	public LinkedList<IPlacename> getPlaceName(int municaplityCode,
			String placename, String municaplity) throws RemoteException,
			LMAccountException, LMUnavailableException {

		java.util.LinkedList<IPlacename> places = new LinkedList<IPlacename>();

		try {

			List<Feature> features = PlacenameServiceUtils.findOrt(
					municaplityCode, placename, municaplity);

			for (int i = 0; i <= features.size() - 1; i++) {

				String plName = features.get(i).getProperties().get("name").toString();
				String plGeometry = features.get(i).getGeometry().toString();

				Placename pln = new Placename(plName, municaplity, plGeometry);
				places.add(pln);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return places;
	}

	@Override
	public LinkedList<IEstate> getEstate(String searchString,
			String municipality) throws RemoteException, LMAccountException,
			LMUnavailableException {
		

		LinkedList<IEstate> estates = new LinkedList<IEstate>();
		try {
			FeatureCollection response = RegisterServiceUtils.findRegisterenheter(searchString, municipality);
			for (Feature fc : response.getFeatures()) {
				String estateName = fc.getProperties().get("name").toString();
				Geometry geom = fc.getGeometry();
				
				ObjectMapper mapper = new ObjectMapper();
				JsonNode jn = mapper.readValue(fc.getGeometry().toString(),	JsonNode.class);
				JsonNode coords = jn.findValue("coordinates");
				MultiPolygon mp = null;
				for(int i=0; i< coords.size(); i++){
					
					FeatureCollection enhetsOmrResponse = FastighetServiceUtils.getEnhetsomraden(fc.getProperties().get("objid").toString(),  "sundsvall");
					
					int fCount = 0;
					double[][][][] coordArray = new double[enhetsOmrResponse.getFeatures().length][][][] ;
					for (Feature enhetsomr : enhetsOmrResponse.getFeatures()) {
						
						Geometry geome = enhetsomr.getGeometry();
						Polygon pol = (Polygon) geome;
						coordArray[fCount] =	pol.getCoordinates();
						fCount ++;
					}
				
					mp = new MultiPolygon(coordArray);
				}
				
				Integer estateID = (Integer) fc.getProperties().get("id");
				Estate estate = new Estate(estateName, mp.toString(),municipality, estateID);
				estates.add(estate);

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return estates;
	}

	@Override
	public LinkedList<IAddress> getAddress(String searchStr, String municaplity)
			throws RemoteException, LMAccountException, LMUnavailableException {

		java.util.LinkedList<IAddress> addresses = new LinkedList<IAddress>();
		try {
			FindAdressResponse adressresponse = AddressServiceUtils.findAdress(
					searchStr, municaplity);
			for (int i = 0; i <= adressresponse.getAdress().size() - 1; i++) {
				
				String estateName = null;
				String municipality = municaplity;
				Integer estateID = null;
				String geometry = adressresponse.getAdress().get(i).getAdressplatspunkt().getPos().getValue().toString();
				String sub_municipality = adressresponse.getAdress().get(i).getKommundelsnamn();
				String adress_area = adressresponse.getAdress().get(i).getAdressomrade();
				String zipcode = adressresponse.getAdress().get(i).getPostnummer();
				String postadress = adressresponse.getAdress().get(i).getPostort();
				String address = adressresponse.getAdress().get(i).getAdressomrade()+ " "+ adressresponse.getAdress().get(i).getAdressplatsnummer();

				addresses.add(new Address(estateName, address, municipality,estateID, geometry, sub_municipality, adress_area, zipcode, postadress));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return addresses;
	}

}
