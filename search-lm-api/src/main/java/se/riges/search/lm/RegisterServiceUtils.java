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

import net.opengis.gml._3.PointPropertyType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.wololo.geojson.Feature;
import org.wololo.geojson.FeatureCollection;
import org.wololo.jts2geojson.GeoJSONWriter;

import se.lantmateriet.namespace.distribution.produkter.registerbeteckning.v3.EnhetsomradeType;
import se.lantmateriet.namespace.distribution.produkter.registerbeteckning.v3.FindRegisterbeteckningRequestType;
import se.lantmateriet.namespace.distribution.produkter.registerbeteckning.v3.GetRegisterbeteckningRequestType;
import se.lantmateriet.namespace.distribution.produkter.registerbeteckning.v3.MatchModeType;
import se.lantmateriet.namespace.distribution.produkter.registerbeteckning.v3.MatchSearchStringType;
import se.lantmateriet.namespace.distribution.produkter.registerbeteckning.v3.ObjektstatusType;
import se.lantmateriet.namespace.distribution.produkter.registerbeteckning.v3.RegisterbeteckningMemberType;
import se.lantmateriet.namespace.distribution.produkter.registerbeteckning.v3.RegisterbeteckningPortType;
import se.lantmateriet.namespace.distribution.produkter.registerbeteckning.v3.RegisterbeteckningResponseType;
import se.lantmateriet.namespace.distribution.produkter.registerbeteckning.v3.RegisterbeteckningService;
import se.lantmateriet.namespace.distribution.produkter.registerbeteckning.v3.RegisterbeteckningType;
import se.lantmateriet.namespace.distribution.produkter.registerbeteckning.v3.RegisterbeteckningsreferensResponseType;
import se.lantmateriet.namespace.distribution.produkter.registerbeteckning.v3.RegisterenhetsreferensType;
import se.lantmateriet.namespace.distribution.produkter.registerbeteckning.v3.SearchStringFilterType;
import se.riges.lm.rmi.exceptions.LMAccountException;

import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.MultiPoint;
import com.vividsolutions.jts.geom.Point;

public class RegisterServiceUtils extends ServiceUtils {
	static final Logger LOG = LoggerFactory.getLogger(RegisterServiceUtils.class);
	
	static RegisterbeteckningService service = null;
	
	static final GmlConverter gmlConverter = new GmlConverter();
	static final GeoJSONWriter geoJSONWriter = new GeoJSONWriter();
	
	static {
		gmlConverter.setSwapAxes(true);
	}
	
	static void initService() {
		if (service == null) {
			URL url = null;
			try {
				url = new URL("http://namespace.lantmateriet.se/distribution/produkter/registerbeteckning/v3/registerbeteckning-3.2.wsdl");
			} catch (MalformedURLException e) {
				throw new RuntimeException(e);
			}
			QName qName = new QName("http://namespace.lantmateriet.se/distribution/produkter/registerbeteckning/v3", "RegisterbeteckningService");
			
			service = new RegisterbeteckningService(url, qName);
			// NOTE: enable next line to trace SOAP XML
			// trace(service);
		}
	}
	
	static RegisterbeteckningPortType createBinding(String lmUser) throws IOException, LMAccountException {
		initService();
		RegisterbeteckningPortType binding = service.getRegisterbeteckningSoapBinding();
		setAuth((BindingProvider) binding, lmUser);
		return binding;
	}
	
	static public List<RegisterenhetsreferensType> findRegisterbeteckning(String searchString, String lmUser) throws IOException, LMAccountException {
		LOG.info("Calling findRegisterbeteckning with search string: " + searchString);
		
		if (searchString.length()<3) {
			throw new RuntimeException("search string must be longer than 3 chars");
		}
		
		RegisterbeteckningPortType binding = createBinding(lmUser);
		FindRegisterbeteckningRequestType request = new FindRegisterbeteckningRequestType();
		SearchStringFilterType searchStringFilterType = new SearchStringFilterType();
		searchStringFilterType.setMaxHits(40);
		MatchSearchStringType matchSearchStringType = new MatchSearchStringType();
		matchSearchStringType.setMatch(MatchModeType.STARTS_WITH);
		matchSearchStringType.setValue(searchString);
		searchStringFilterType.setSearchString(matchSearchStringType);
		request.setRegisterbeteckningSearchStringFilter(searchStringFilterType);
		RegisterbeteckningsreferensResponseType response = binding.findRegisterbeteckning(request);
		LOG.info("Got response from findRegisterbeteckning (" + response.getRegisterenhetsreferens().size() + " hits)");
		return response.getRegisterenhetsreferens();
	}
	
	static public RegisterbeteckningResponseType getRegisterenhetsreferens(List<String> objs, String lmUser) throws IOException, LMAccountException {
		LOG.info("Calling getRegisterbeteckning with " + objs.size() + " objids");
		RegisterbeteckningPortType binding = createBinding(lmUser);
		GetRegisterbeteckningRequestType request = new GetRegisterbeteckningRequestType();
		request.getObjektidentitet().addAll(objs);
		RegisterbeteckningResponseType response = binding.getRegisterbeteckning(request);
		LOG.info("Got response from getRegisterbeteckning (" + response.getRegisterbeteckningMember().size() + " hits)");
		return response;
	}
	
	static public FeatureCollection findRegisterenheter(String searchString, String lmUser) throws IOException, LMAccountException {
		List<RegisterenhetsreferensType> registerenhetsreferenser = findRegisterbeteckning(searchString, lmUser);
		List<String> objids = new ArrayList<String>();
		
		HashMap<String, String> beteckningMap = new HashMap<String, String>();
		for (RegisterenhetsreferensType registerenhetsreferens : registerenhetsreferenser) {
			String objid = registerenhetsreferens.getObjektidentitet();
			objids.add(objid);
			beteckningMap.put(objid, registerenhetsreferens.getBeteckning());
		}
		
		List<Feature> features = new ArrayList<Feature>();
		
		if (objids.size() > 0) {
			RegisterbeteckningResponseType registerbeteckningResponse = getRegisterenhetsreferens(objids, lmUser);
			List<RegisterbeteckningMemberType> members = registerbeteckningResponse.getRegisterbeteckningMember();
			for (RegisterbeteckningMemberType registerbeteckningMember : members) {
				RegisterbeteckningType registerbeteckning = registerbeteckningMember.getRegisterbeteckning();
				if (registerbeteckning.getObjektstatus() == ObjektstatusType.AVREGISTRERAD) continue;
				List<Point> points = new ArrayList<Point>();
				for (EnhetsomradeType enhetsomrade : registerbeteckning.getEnhetsomrade()) {
					PointPropertyType pointPropertyType = enhetsomrade.getPunkt();
					if (pointPropertyType == null) continue;
					Point point = (Point) gmlConverter.toJtsGeometry(pointPropertyType.getPoint());
					points.add(point);
				}
				GeometryFactory factory = new GeometryFactory();
				MultiPoint multiPoint = factory.createMultiPoint(points.toArray(new Point[] {}));
				Map<String, Object> properties = new HashMap<String, Object>();
				properties.put("name", beteckningMap.get(registerbeteckning.getObjektidentitet()));
				properties.put("objid", registerbeteckning.getObjektidentitet());
				properties.put("fnr", registerbeteckning.getFastighetsnyckel());
				Feature feature = new Feature(geoJSONWriter.write(multiPoint), properties);
				features.add(feature);
			}
			
		}
		
		LOG.info("Transformed " + objids.size() + " to " + features.size() + " features");
		
		return geoJSONWriter.write(features);
	}
}
