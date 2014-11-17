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
