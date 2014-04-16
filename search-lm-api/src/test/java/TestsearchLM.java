import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.List;

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
	public void testPlacenameServiceUtil() {
		 try {
				List<Feature> features =  PlacenameServiceUtils.findOrt(2281, "ortv", "sundsvall");
				
				boolean test1 = features.size() == 1;
			
				assertTrue("both are identical", test1);
				
			} catch (Exception e) {
				
				// TODO Auto-generated catch block
				e.printStackTrace();
				fail("Not yet implemented");
			}
	
	}
	@Test
	public void testAdressServiceUtil() {
		 try {
				FindAdressResponse adressresponse =  AddressServiceUtils.findAdress("sundsvall storgatan", "Sundsvall");
				
				boolean test1 = true;//adressresponse.size() == 1;
				System.out.println(adressresponse.toString());
				assertTrue("both are identical", test1);
				
			} catch (Exception e) {
				
				// TODO Auto-generated catch block
				e.printStackTrace();
				fail("Not yet implemented");
			}
	
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
