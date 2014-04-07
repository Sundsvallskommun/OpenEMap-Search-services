package se.riges.search.lm.resources;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

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
    	LOG.debug("Handling exception using GenericExceptionMapper", e);
    	ObjectNode message = factory.objectNode();

		message.put("success", false);
    	message.put("message", e.getMessage());
    	//StringWriter sw = new StringWriter();
    	//PrintWriter pw = new PrintWriter(sw);
    	//e.printStackTrace(pw);
    	//message.put("stackTrace", sw.toString());
    	
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(message).build();
    }
}