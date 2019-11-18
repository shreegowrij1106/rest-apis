package com.rest.api.service;

import com.rest.api.service.InvalidIdException;

public enum PathParamModel 
{
	Instance;

    public String getEmployeeById(String id) {
        
         //   long l = Long.parseLong(id);
        	if(id.matches("\\d+(:\\d+)"))
    		{
    			System.out.println("number is valid");
   		    		    		
    	}
         else {
            throw new InvalidIdException("Employee id is not valid, " + id);
        }
		return id;

    }
    
    

}
