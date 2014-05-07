package se.riges.search.lm.resources;

import java.io.IOException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.wololo.geojson.Feature;

import se.riges.lm.rmi.exceptions.LMAccountException;

@Path("/placenames")
public class Placename {

	@GET
	@Produces("application/json")
	public List<Feature> findPlacename(@QueryParam("kommunkod") String kommunkod, @QueryParam("q") String searchString, @QueryParam("lmuser") String lmUser) throws IOException, LMAccountException {
		List<Feature> result = se.riges.search.lm.PlacenameServiceUtils.findOrt(kommunkod, searchString, lmUser);

		return result;
	}
}