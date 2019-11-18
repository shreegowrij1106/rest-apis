package com.rest.api.service1;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class BeanValConstrainViolationExceptionMapper implements ExceptionMapper<ConstraintViolationException>{

    public Response toResponse(ConstraintViolationException e) {
        System.out.println("BeanValConstrainViolationExceptionMapper in action");

        ConstraintViolation cv = (ConstraintViolation) e.getConstraintViolations().toArray()[0];
        return Response.status(Response.Status.PAYMENT_REQUIRED)
                .entity(new ConstraintViolationEntity(cv.getMessage()))
                .build();
    }
    
}
