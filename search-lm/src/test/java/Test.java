import java.io.IOException;

import junit.framework.Assert;
import junit.framework.TestCase;
import se.riges.search.lm.RegisterServiceUtils;


public class Test extends TestCase {

	public void testFindObjektidentitet() throws IOException {
		try{
//		Assert.assertEquals("909a6a81-0618-90ec-e040-ed8f66444c3f", RegisterServiceUtils.findRegisterbeteckning("SUNDSVALL TOMMING 2:6").get(0).getObjektidentitet(), "sundsvall");
		}catch(Exception x){
			System.out.println(x);
		}
//		Assert.assertEquals(8, RegisterServiceUtils.findRegisterbeteckning("SUNDSVALL NYTTAN", "sundsvall").size());
	}
}