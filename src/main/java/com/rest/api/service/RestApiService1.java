package com.rest.api.service;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/test")
public class RestApiService1 
{

	@GET
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	@Path("/testing/{empId}")
	public Response getEmployeeId(@Valid @Pattern(regexp="\\d+(:\\d+)",message="Invalid Record Id")@PathParam(value="empId") String empId) 	
	{		
		String employeeId=PathParamModel.Instance.getEmployeeById(empId);
		System.out.println("empId :: "+PathParamModel.Instance.getEmployeeById(empId));
		 return Response.status(200).entity("employeeId"+employeeId).build(); 		
	}
	
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	@Path("/emp")
	public Response getEmpId(@Valid PathParamModel1 param)
	{		
		
		System.out.println("record d :: "+param);
		 return Response.status(200).entity("param >>><<<<"+param.getRecId()).build(); 		
	}

}
