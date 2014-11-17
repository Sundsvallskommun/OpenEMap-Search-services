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

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.node.ArrayNode;
import org.junit.Test;
import org.wololo.geojson.Feature;

import com.vividsolutions.jts.geom.Geometry;

import se.lantmateriet.namespace.distribution.products.address.v2.FindAdressResponse;
import se.lantmateriet.namespace.distribution.produkter.registerbeteckning.v3.RegisterenhetsreferensType;
import se.riges.lm.rmi.exceptions.LMAccountException;
import se.riges.search.lm.AddressServiceUtils;
import se.riges.search.lm.FastighetServiceUtils;
import se.riges.search.lm.PlacenameServiceUtils;
import se.riges.search.lm.RegisterServiceUtils;

public class TestsearchLM {

	@Test
	public void testPlacenameServiceUtil() throws IOException, LMAccountException {
		List<Feature> features =  PlacenameServiceUtils.findOrt("2281", "ortv", "sundsvall");
		assertTrue(features.size() == 1);
		features =  PlacenameServiceUtils.findOrt("2280,2281", "sand", "sundsvall");
		assertTrue(features.size() == 23);
	}
	@Test
	public void testPlacenameServiceUtilUsingNUll() throws IOException, LMAccountException {
		List<Feature> features =  PlacenameServiceUtils.findOrt(null, "ortv", "sundsvall");
		assertTrue(features.size() == 7);
	}
	
	@Test
	public void testAdressServiceUtils() throws IOException, LMAccountException {
		ArrayNode result = (ArrayNode) AddressServiceUtils.findAddress("sundsvall storgatan 1", "Sundsvall");
		assertTrue(result.size() == 11);
		assertTrue(((ArrayNode)result.get(0)).get(0).asInt() == 2849180);
	}
	
	@Test
	public void testAdressServiceUtilsMulti() throws IOException, LMAccountException {
		ArrayNode result = (ArrayNode) AddressServiceUtils.findAddress("sundsvall,härnösand storgatan 1", "Sundsvall");
		assertTrue(result.size() == 27);
		assertTrue(((ArrayNode)result.get(0)).get(0).asInt() == 2849180);
	}
	
	@Test
	public void testRegisterServiceUtils() throws IOException, LMAccountException {
		List<RegisterenhetsreferensType> result = RegisterServiceUtils.findRegisterbeteckning("SUNDSVALL AB", "Sundsvall");
		assertTrue(result.size() == 2);
		assertTrue(result.get(0).getBeteckning().equals("SUNDSVALL ABBOTEN 1"));
	}
	
	@Test
	public void testRegisterServiceUtilsMulti() throws IOException, LMAccountException {
		List<RegisterenhetsreferensType> result = RegisterServiceUtils.findRegisterbeteckning("SUNDSVALL,ÖRNSKÖLDSVIK AB", "Sundsvall");
		assertTrue(result.size() == 13);
		assertTrue(result.get(0).getBeteckning().equals("SUNDSVALL ABBOTEN 1"));
	}
	
	@Test
	public void testFastighetServiceUtil() throws IOException, LMAccountException {
		Geometry result = FastighetServiceUtils.getRegisterenhetGeometry("909a6a81-f391-90ec-e040-ed8f66444c3f", "Sundsvall");
		assertTrue("POLYGON ((687869.627 7022301.919, 687895.424 7022322.445, 687880.8 7022339.365, 687855.434 7022321.123, 687869.627 7022301.919))".equals(result.toString()));
	}
}
