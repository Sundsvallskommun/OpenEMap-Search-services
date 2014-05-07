import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.node.ArrayNode;
import org.junit.Test;
import org.wololo.geojson.Feature;

import se.lantmateriet.namespace.distribution.products.address.v2.FindAdressResponse;
import se.lantmateriet.namespace.distribution.produkter.registerbeteckning.v3.RegisterenhetsreferensType;
import se.riges.lm.rmi.exceptions.LMAccountException;
import se.riges.search.lm.AddressServiceUtils;
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
}
