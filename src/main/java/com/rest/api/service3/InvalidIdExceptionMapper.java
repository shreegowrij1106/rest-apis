package com.rest.api.service3;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import com.rest.api.service.InvalidIdException;

@Provider
public class InvalidIdExceptionMapper implements ExceptionMapper<InvalidIdException> {

	 
	    public Response toResponse(InvalidIdException exception) {
	        return Response.status(Response.Status.BAD_REQUEST)
	                       .entity(prepareMessage(exception))
	                       .type("text/plain")
	                       .build();
	    }

	    private String prepareMessage(InvalidIdException exception) {

	        String m = exception.getMessage();
	        String r = "Invalid request.\n";
	        r += String.format("Error Message: %s.%nError Type: %s.%n"
	                        + "You may contact admin@example.com for more questions.",
	                m, exception.getClass());
	        return r;
	    }


   
}