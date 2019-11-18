package com.rest.api.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ValidationExceptionMapper implements ExceptionMapper<ConstraintViolationException>{

	
	public ValidationExceptionMapper() {
		System.out.println("regi happening");
	}

	@Override
	public Response toResponse(ConstraintViolationException exception) {
		return Response.status(Response.Status.BAD_REQUEST)
                .entity(prepareMessage(exception))
                .type(MediaType.APPLICATION_JSON)
                .build();
	}
	
	private String prepareMessage(ConstraintViolationException exception) {
		List<ValidationErrorMsgModel> errors = new ArrayList<ValidationErrorMsgModel>();
        String msg = "";
        for (ConstraintViolation<?> cv : exception.getConstraintViolations()) {
        	
        	errors.add(new ValidationErrorMsgModel(getInvalidValue(cv.getInvalidValue()), cv.getMessage(),
                    cv.getMessageTemplate(), getPath(cv)));
            msg+=cv.getPropertyPath()+" "+cv.getMessage()+"\n";
        }
        return msg;
    }
	
	 private String getInvalidValue(final Object invalidValue) {
	        if (invalidValue == null) {
	            return null;
	        }
	 
	        if (invalidValue.getClass().isArray()) {
	            return Arrays.toString((Object[]) invalidValue);
	        }
	 
	        return invalidValue.toString();
	    }
	 
	 private String getPath(final ConstraintViolation<?> violation) {
	        final String leafBeanName = violation.getLeafBean().getClass().getSimpleName();
	        final String leafBeanCleanName = (leafBeanName.contains("$")) ? leafBeanName.substring(0,
	                leafBeanName.indexOf("$")) : leafBeanName;
	        final String propertyPath = violation.getPropertyPath().toString();
	 
	        return leafBeanCleanName + (!"".equals(propertyPath) ? '.' + propertyPath : "");
	    }
}
