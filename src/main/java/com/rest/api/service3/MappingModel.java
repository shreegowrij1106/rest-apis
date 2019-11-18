package com.rest.api.service3;

import java.util.ArrayList;
import java.util.List;

public class MappingModel 
{
	private String name="";
	@MappingModelCheck(message="mapping data is invalid")
	List<ObjectIdModel> mapping=new ArrayList<ObjectIdModel>();
	public MappingModel(String name, List<ObjectIdModel> mapping) {
		super();
		this.name = name;
		this.mapping = mapping;
	}	
	
	
	
	
	
	

}
