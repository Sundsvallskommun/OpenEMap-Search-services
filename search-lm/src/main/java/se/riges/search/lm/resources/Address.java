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

package se.riges.search.lm.resources;

import java.io.IOException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.codehaus.jackson.JsonNode;
import org.wololo.geojson.Feature;

import se.lantmateriet.namespace.distribution.products.address.v2.AdressType;
import se.lantmateriet.namespace.distribution.products.address.v2.FindAdressResponse;
import se.lantmateriet.namespace.distribution.produkter.fastighet.v1.RegisterenhetResponseType;
import se.riges.lm.rmi.exceptions.LMAccountException;

import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.PrecisionModel;

@Path("/addresses")
public class Address {
	
	GeometryFactory geometryFactory = new GeometryFactory(new PrecisionModel(PrecisionModel.FLOATING), 3006);

	@GET
	@Produces("application/json")
	public JsonNode findAddress(@QueryParam("q") String searchString, @QueryParam("lmuser") String lmUser) throws IOException, LMAccountException {
		
		JsonNode result = se.riges.search.lm.AddressServiceUtils.findAddress(searchString, lmUser);
		return result;
	}
	
	 @GET
     @Produces("application/json")
     @Path("validate/{estate}")
     public Estate findAddress2(@PathParam("estate") String estate, @QueryParam("lmuser") String lmUser) throws IOException, LMAccountException {

             FindAdressResponse result = se.riges.search.lm.AddressServiceUtils.findAdress(estate, lmUser);
             List<AdressType> addresses = result.getAdress();
             String estateID = addresses.get(0).getFastighetsnyckel();
             
             
             RegisterenhetResponseType response = se.riges.search.lm.FastighetServiceUtils.getRegisterenhetByFnr(estateID, lmUser);
             
             String registerOmrade = response.getRegisterenhetMember().get(0).getRegisterenhet().getValue().getRegisterbeteckning().getRegisteromrade().trim();
             String trakt = response.getRegisterenhetMember().get(0).getRegisterenhet().getValue().getRegisterbeteckning().getTraktnamn().trim();
             String enhet =  response.getRegisterenhetMember().get(0).getRegisterenhet().getValue().getRegisterbeteckning().getBlock().trim();
             String block = Integer.toString(response.getRegisterenhetMember().get(0).getRegisterenhet().getValue().getRegisterbeteckning().getEnhet());
         		
             String estateName = registerOmrade + " " + trakt + " " + (("*".equals(enhet)) ? "" : (enhet + ":")) + ("*".equals(block) ? "" : block);

             //String estateName = registerOmrade + " " + trakt + " " + enhet + ":" + block;
             
             return new Estate(estateID, estateName, "");
     }
	
	@GET
	@Produces("application/json")
	@Path("{id}/enhetsomrade")
	public Feature getEnhetsomrade(@PathParam("id") String id, @QueryParam("lmuser") String lmUser) throws IOException, LMAccountException {
		Point point = se.riges.search.lm.AddressServiceUtils.getAddressPoint(id, lmUser);
		Feature result = se.riges.search.lm.FastighetServiceUtils.findEnhetsomrade(point, lmUser);
				
		return result;
	}
}