package se.riges.search.lm.resources;

import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.wololo.geojson.FeatureCollection;

import se.riges.lm.rmi.exceptions.LMAccountException;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.PrecisionModel;

@Path("/registerenheter")
public class Registerenhet {
	
	GeometryFactory geometryFactory = new GeometryFactory(new PrecisionModel(PrecisionModel.FLOATING), 3006);
	
	@GET
	@Produces("application/json")
	public String findRegisterenhet(
			@QueryParam("x") Double x,
			@QueryParam("y") Double y,
			@QueryParam("q") String searchString,
			@QueryParam("fnr") String fnr,
			@QueryParam("fnrsimple") String fnrsimple,
			@QueryParam("lmuser") String lmUser) throws IOException, LMAccountException {
		String result;
		
		ObjectMapper mapper = new ObjectMapper(); 
		
		if (x != null) {
			Point point = geometryFactory.createPoint(new Coordinate(x, y));
			JsonNode beteckning = se.riges.search.lm.FastighetServiceUtils.findRegisterenhetBeteckning(point, lmUser);
			result = mapper.writeValueAsString(beteckning);
		} else if (fnr != null) {
			FeatureCollection enhetsomraden = se.riges.search.lm.FastighetServiceUtils.getEnhetsomradenByFnr(fnr, lmUser);
			result = mapper.writeValueAsString(enhetsomraden);
		} else if (fnrsimple != null){
			FeatureCollection enhetsomraden = se.riges.search.lm.FastighetServiceUtils.getEnhetsomradenByFnrSingle(fnrsimple, lmUser);
			result = mapper.writeValueAsString(enhetsomraden);
		}
		else {
			FeatureCollection registerenheter = se.riges.search.lm.RegisterServiceUtils.findRegisterenheter(searchString, lmUser);
			result = mapper.writeValueAsString(registerenheter);
		}
		
		return result;
	}
	
	@GET
	@Produces("application/json")
	@Path("{objid}")
	public Geometry getRegisterenhet(@PathParam("objid") String objid, @QueryParam("lmuser") String lmUser) throws IOException, LMAccountException {

		Geometry result = se.riges.search.lm.FastighetServiceUtils.getRegisterenhetGeometry(objid, lmUser);
				
		return result;
	}
	
	@GET
	@Produces("application/json")
	@Path("{objid}/enhetsomraden")
	public FeatureCollection getEnhetsomraden(@PathParam("objid") String objid, @QueryParam("lmuser") String lmUser) throws IOException, LMAccountException {
		FeatureCollection result = se.riges.search.lm.FastighetServiceUtils.getEnhetsomraden(objid, lmUser);
				
		return result;
	}
}