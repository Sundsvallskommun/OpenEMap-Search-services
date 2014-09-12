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
