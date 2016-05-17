package se.riges.search.lm.resources;

import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;

import se.riges.lm.rmi.exceptions.LMAccountException;
import se.riges.search.lm.ServiceUtils;

@Path("elevation")
public class Elevation {
	@GET
	@Produces("application/json")
	public Response get(@QueryParam("lmuser") String lmUser, @QueryParam("srid") int srid, @QueryParam("x") double x, @QueryParam("y") double y) throws LMAccountException, IOException {
		final String url = "https://services.lantmateriet.se/distribution/produkter/hojd/v1/rest/api";
		final String path = "/hojd/" + srid + "/" + x + "/" + y;
		
		final String username = ServiceUtils.getUsername(lmUser);
		final String password = ServiceUtils.getPassword(lmUser);
		final HttpAuthenticationFeature feature = HttpAuthenticationFeature.basicBuilder()
			    .nonPreemptive().credentials(username, password).build();
		
		final Client client = ClientBuilder.newClient();
		client.register(feature);
		
		final WebTarget target = client.target(url).path(path);
		return target.request().get();
	}
}
