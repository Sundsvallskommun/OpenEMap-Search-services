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