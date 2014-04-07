package se.riges.search.lm;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import se.riges.search.rmi.*;

@ApplicationPath("/")
@WebListener
public class Application extends ResourceConfig implements ServletContextListener {
	
	static final Logger logger = LoggerFactory.getLogger(Application.class);
	
	public Application() {
		packages("se.riges.search.lm.resources");
		register(JacksonFeature.class);
	}
	
	private LMValidateServer validateServer = null;
	private LMValidateServer searchServer = null;
	
	@Override
	public void contextDestroyed(ServletContextEvent event) {
		try {
			validateServer.stopServer();
			searchServer.stopServer();
		} catch (Exception e) {
			logger.error("Failed to stop RMI server", e);
		}
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		try {
			validateServer = new LMValidateServer();
			validateServer.startServer(1099, "", "searchlm");
			
			
			searchServer = new LMValidateServer();
			searchServer.startServer(1100,  "",  "search");
			
		} catch (Exception e) {
			logger.error("Failed to start RMI server", e);
		}
	}
}
