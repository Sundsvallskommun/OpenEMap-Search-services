package se.riges.search.lm;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import net.opengis.gml.v_3_1_1.profiles.gmlsfprofile.v_1_0_0.PointType;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.JsonNodeFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.wololo.jts2geojson.GeoJSONWriter;

import se.lantmateriet.namespace.distribution.products.address.v2.Address;
import se.lantmateriet.namespace.distribution.products.address.v2.AddressService;
import se.lantmateriet.namespace.distribution.products.address.v2.AdressCriteriaType;
import se.lantmateriet.namespace.distribution.products.address.v2.AdressType;
import se.lantmateriet.namespace.distribution.products.address.v2.FindAdressRequest;
import se.lantmateriet.namespace.distribution.products.address.v2.FindAdressResponse;
import se.lantmateriet.namespace.distribution.products.address.v2.MatchFritextType;
import se.lantmateriet.namespace.distribution.products.address.v2.MatchModeType;
import se.riges.lm.rmi.exceptions.LMAccountException;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.PrecisionModel;

public class AddressServiceUtils extends ServiceUtils {
	static final Logger LOG = LoggerFactory.getLogger(AddressServiceUtils.class);
	
	static final JsonNodeFactory factory = JsonNodeFactory.instance;
	
	static final GmlConverter gmlConverter = new GmlConverter();
	static final GeoJSONWriter geoJSONWriter = new GeoJSONWriter();
	
	static AddressService service = null;
	
	static {
		gmlConverter.setSwapAxes(true);
	}
	
	static void initService() {
		if (service == null) {
			URL url = null;
			try {
				url = new URL("http://namespace.lantmateriet.se/distribution/products/address/v2/address-2.0.wsdl");
			} catch (MalformedURLException e) {
				throw new RuntimeException(e);
			}
			QName qName = new QName("http://namespace.lantmateriet.se/distribution/products/address/v2", "addressService");
			
			service = new AddressService(url, qName);
			// NOTE: enable next line to trace SOAP XML
			//trace(service);
		}
	}
	
	static Address createBinding(String lmUser) throws IOException, LMAccountException {
		initService();
		Address binding = service.getAddressSoap12();
		setAuth((BindingProvider) binding, lmUser);
		return binding;
	}
	
	static public JsonNode findAddress(String searchString, String lmUser) throws IOException, LMAccountException {
		LOG.info("Calling findAddress with search string: " + searchString);

		
		FindAdressResponse response = findAdress(searchString, lmUser);
		
		LOG.info("Got response from findAdressreferens (" + response.getAdress().size() + " hits)");
		
		ArrayNode rows = factory.arrayNode();
		for (AdressType adress : response.getAdress()) {
			ArrayNode row = factory.arrayNode();
			
			// NOTE: need manual conversion, only have GML 3.2 conversion classes....
			PointType pointType = adress.getAdressplatspunkt();
			double x = pointType.getPos().getValue().get(0);
			double y = pointType.getPos().getValue().get(1);
			Point point = new GeometryFactory(new PrecisionModel(PrecisionModel.FLOATING), 3006).createPoint(new Coordinate(x, y));
			
			String fnr = adress.getFastighetsnyckel();
			
			row.add(adress.getAdressplatsid());
			row.add(adress.getKommunnamn() + " " + adress.getAdressomrade() + " " + adress.getAdressplatsnummer() + ", " + adress.getKommundelsnamn());
			row.add(y);
			row.add(x);
			row.add(fnr);
			rows.add(row);
		}
		
		return rows;
	}
	
	/**
	 * Search method to find address from LM
	 * @param searchString
	 * @return FindAdressResponse
	 * @throws IOException
	 */
	public static FindAdressResponse findAdress(String searchString, String lmUser) throws IOException, LMAccountException{
		LOG.info("Calling findAddress with search string return FindAdressResponse: " + searchString);
		
		Address binding = createBinding(lmUser);
		
		String[] terms = searchString.split(" ");
		
		FindAdressRequest findAdressRequest = new FindAdressRequest();
		AdressCriteriaType adressCriteria = new AdressCriteriaType();
		if (terms.length < 2) {
			throw new RuntimeException("Too few terms in search string");
		} else if (terms.length == 3) {
			MatchFritextType matchFritextType = new MatchFritextType();
			matchFritextType.setMatch(MatchModeType.STARTS_WITH);
			matchFritextType.setValue(terms[2]);
			adressCriteria.setAdressplatsnummer(matchFritextType);
		}
		MatchFritextType matchFritextType = new MatchFritextType();
		matchFritextType.setMatch(MatchModeType.STARTS_WITH);
		matchFritextType.setValue(terms[1]);
		adressCriteria.setAdressomrade(matchFritextType);
		adressCriteria.setKommunnamn(terms[0]);
		findAdressRequest.setAdressCriteria(adressCriteria);
		try{
		FindAdressResponse response = binding.findAdress(findAdressRequest);
		return response;
		}
		catch (Exception e){
			LOG.debug("Fel i Find", e);
			throw e;
		}
	}
	
	public static FindAdressResponse validateAdress(String searchString, String lmUser) throws IOException, LMAccountException{
		LOG.info("Calling findAddress with search string return FindAdressResponse: " + searchString);
		
		Address binding = createBinding(lmUser);
		
		String[] terms = searchString.split(" ");
		
		FindAdressRequest findAdressRequest = new FindAdressRequest();
		AdressCriteriaType adressCriteria = new AdressCriteriaType();
		if (terms.length < 2) {
			throw new RuntimeException("Too few terms in search string");
		} else if (terms.length == 3) {
			MatchFritextType matchFritextType = new MatchFritextType();
			matchFritextType.setMatch(MatchModeType.EQUALS);
			matchFritextType.setValue(terms[2]);
			adressCriteria.setAdressplatsnummer(matchFritextType);
		}
		MatchFritextType matchFritextType = new MatchFritextType();
		matchFritextType.setMatch(MatchModeType.EQUALS);
		matchFritextType.setValue(terms[1]);
		adressCriteria.setAdressomrade(matchFritextType);
		adressCriteria.setKommunnamn(terms[0]);
		findAdressRequest.setAdressCriteria(adressCriteria);
		try{
			FindAdressResponse response = binding.findAdress(findAdressRequest);
		return response;
		}
		catch (Exception e){
			LOG.debug("Fel i Find", e);
			throw e;
		}
	}
	
	public static Point getAddressPoint(String id, String lmUser) throws IOException, LMAccountException {
		AdressType adress = getAddress(id, lmUser);
		
		PointType pointType = adress.getAdressplatspunkt();
		double x = pointType.getPos().getValue().get(0);
		double y = pointType.getPos().getValue().get(1);
		Point point = new GeometryFactory(new PrecisionModel(PrecisionModel.FLOATING), 3006).createPoint(new Coordinate(x, y));
		
		return point;
	}
	
	public static AdressType getAddress(String id) throws IOException, LMAccountException {
		return AddressServiceUtils.getAddress(id, null);
	}
	public static AdressType getAddress(String id, String lmUser) throws IOException, LMAccountException {
		Address binding = createBinding(lmUser);
		
		FindAdressRequest findAdressRequest = new FindAdressRequest();

		findAdressRequest.getId().add(id);
		FindAdressResponse response = binding.findAdress(findAdressRequest);
		AdressType adress = response.getAdress().get(0);
		
		return adress;
	}
}
