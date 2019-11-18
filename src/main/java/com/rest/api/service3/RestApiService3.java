package com.rest.api.service3;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/test3")
public class RestApiService3 {

	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	@Path("/shree")
	//public Response getShreeModel(@Valid @ConvertGroup(from = Default.class,to = GroupUserId.class) ShreeModel shree)
	public Response getShreeModel(@Valid ShreeModel shree)
	{
		
		 return Response.status(200).entity("validation successfull").build(); 
	}
	
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	@Path("/collection")
	//public Response getShreeModel(@Valid @ConvertGroup(from = Default.class,to = GroupUserId.class) ShreeModel shree)
	public Response getCollection(@Valid CollectionModel shree)
	{
		
		 return Response.status(200).entity("validation successfull").build(); 
	}
	
	
}
