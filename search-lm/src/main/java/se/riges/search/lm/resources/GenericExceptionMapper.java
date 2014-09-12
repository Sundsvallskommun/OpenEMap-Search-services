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

package se.riges.search.lm.resources;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.codehaus.jackson.node.JsonNodeFactory;
import org.codehaus.jackson.node.ObjectNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Provider
public class GenericExceptionMapper implements ExceptionMapper< Exception > {
 
	static final Logger LOG = LoggerFactory.getLogger(GenericExceptionMapper.class);
	static final JsonNodeFactory factory = JsonNodeFactory.instance;
	
    @Override
    public Response toResponse(Exception e) {
    	LOG.error("Unhandled exception will be mapped to JSON and sent as a HTTP 500 reponse", e);
    	ObjectNode message = factory.objectNode();

		message.put("success", false);
    	message.put("message", e.getMessage());
    	message.put("exceptionName", e.getClass().getName());
    	message.put("rootCauseMessage", ExceptionUtils.getRootCauseMessage(e));
    	
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(message).build();
    }
}