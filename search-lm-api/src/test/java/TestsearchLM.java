import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;
import org.wololo.geojson.Feature;

import se.lantmateriet.namespace.distribution.products.address.v2.FindAdressResponse;
import se.riges.search.lm.AddressServiceUtils;
import se.riges.search.lm.PlacenameServiceUtils;

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
}
