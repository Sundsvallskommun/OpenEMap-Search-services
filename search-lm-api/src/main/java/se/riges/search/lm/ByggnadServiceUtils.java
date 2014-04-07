package se.riges.search.lm;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.node.JsonNodeFactory;
import org.codehaus.jackson.node.ObjectNode;

import se.lantmateriet.namespace.distribution.produkter.byggnad.v1.ByggnadPortType;
import se.lantmateriet.namespace.distribution.produkter.byggnad.v1.ByggnadService;
import se.lantmateriet.namespace.distribution.produkter.byggnad.v1.FindByggnadRequestType;
import se.riges.lm.rmi.exceptions.LMAccountException;

public class ByggnadServiceUtils extends ServiceUtils {
	static ByggnadService service = null;
	
	static final JsonNodeFactory factory = JsonNodeFactory.instance;
	
	static void initService() {
		if (service == null) {
			URL url = null;
			try {
				url = new URL("http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1/byggnad-1.3.wsdl");
			} catch (MalformedURLException e) {
				throw new RuntimeException(e);
			}
			QName qName = new QName("http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1", "ByggnadService");
			
			service = new ByggnadService(url, qName);
			// NOTE: enable next line to trace SOAP XML
			// trace(service);
		}
	}
	
	static ByggnadPortType createBinding(String lmUser) throws IOException, LMAccountException {
		initService();
		ByggnadPortType binding = service.getByggnadSoapBinding();
		setAuth((BindingProvider) binding, lmUser);
		return binding;
	}
	
	static public JsonNode findByggnad(double x, double y, String lmUser) throws IOException, LMAccountException {
		
		ByggnadPortType binding = createBinding(lmUser);
		FindByggnadRequestType findByggnadRequest = new FindByggnadRequestType();
		binding.findByggnad(findByggnadRequest);
		
		ObjectNode node = factory.objectNode();
				
		return node;
	}
}
