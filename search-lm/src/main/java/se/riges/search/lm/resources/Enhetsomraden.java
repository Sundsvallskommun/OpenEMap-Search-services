package se.riges.search.lm.resources;

import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.wololo.geojson.Feature;

import se.riges.lm.rmi.exceptions.LMAccountException;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.PrecisionModel;

@Path("/enhetsomraden")
public class Enhetsomraden {
	
	GeometryFactory geometryFactory = new GeometryFactory(new PrecisionModel(PrecisionModel.FLOATING), 3006);
	
	@GET
	@Produces("application/json")
	public Feature findEnhetsomrade(
			@QueryParam("x") double x,
			@QueryParam("y") double y,
			@QueryParam("lmuser") String lmUser) throws IOException, LMAccountException {
		Point point = geometryFactory.createPoint(new Coordinate(x, y));
		
		Feature result = se.riges.search.lm.FastighetServiceUtils.findEnhetsomrade(point, lmUser);
	
		return result;
	}
}