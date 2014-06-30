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