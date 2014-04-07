package se.riges.search.lm;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import se.riges.lm.rmi.exceptions.LMAccountException;

public class ServiceUtils {
	static final Logger LOG = LoggerFactory.getLogger(ServiceUtils.class);
	
	static String config = "config.properties";
	
	static void setAuth(BindingProvider binding, String lmUser) throws IOException, LMAccountException {
		
		Map<String, Object> requestContext = binding.getRequestContext();
		
		Properties props = new java.util.Properties();
		InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(config);
		
		String userCredentials = "";
		if (null == lmUser || lmUser.equals("")){
			LOG.error("LM access not allowed must specify lmUser");
			throw new LMAccountException();
		} else {
			//LOG.info("Loading LM auth from " + config);
			props.load(inputStream);
			userCredentials = props.getProperty(lmUser.toLowerCase());
			if (userCredentials == null)
				throw new LMAccountException();
		}
		
		if (!userCredentials.isEmpty()){
			String[] userInfo =  userCredentials.split(":");
			String username = userInfo[1];
			String password = userInfo[3];
			requestContext.put(BindingProvider.USERNAME_PROPERTY, username.trim());
			requestContext.put(BindingProvider.PASSWORD_PROPERTY, password.trim());
		}
	}

	static void trace(Service service) {
		service.setHandlerResolver(new HandlerResolver() {
			public List<Handler> getHandlerChain(PortInfo portInfo) {
				List<Handler> handlerList = new ArrayList<Handler>();
				handlerList.add(new SOAPLoggingHandler());
				return handlerList;
			}
		});
	}
}