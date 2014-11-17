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