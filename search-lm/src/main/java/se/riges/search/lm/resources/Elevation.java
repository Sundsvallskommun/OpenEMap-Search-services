package se.riges.search.lm.resources;

import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;

import se.riges.lm.rmi.exceptions.LMAccountException;
import se.riges.search.lm.ServiceUtils;

@Path("elevation/{srid}/{x}/{y}")
public class Elevation {
	@GET
	@Produces("application/json")
	public String get(@QueryParam("lmuser") String lmUser, @PathParam("srid") int srid, @PathParam("x") double x, @PathParam("y") double y) throws LMAccountException, IOException {
		final String url = "https://services.lantmateriet.se/distribution/produkter/hojd/v1/rest/api";
		final String path = "/hojd/" + srid + "/" + x + "/" + y;
		
		final String username = ServiceUtils.getUsername(lmUser);
		final String password = ServiceUtils.getPassword(lmUser);
		final HttpAuthenticationFeature feature = HttpAuthenticationFeature.basicBuilder()
			    .nonPreemptive().credentials(username, password).build();
		
		final Client client = ClientBuilder.newClient();
		client.register(feature);
		
		final WebTarget target = client.target(url).path(path);
		Response response = target.request().get();
		String json = response.readEntity(String.class);
		return json;
	}
}
