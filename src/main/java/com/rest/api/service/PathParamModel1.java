package com.rest.api.service;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class PathParamModel1 
{
	@Pattern(regexp = "\\d+(:\\d+)",message="Invalid Record Id")
	//@NotNull(message="should not be null")
	private String recId;
	
	@NotNull
	@Pattern(regexp="([A-Z])+( [A-Z]+)",message="only capital letters are valid")
	private String empName="";

	public PathParamModel1(String recId) {
		super();
		this.recId = recId;
	}

	public PathParamModel1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getRecId() {
		return recId;
	}

	public void setRecId(String recId) {
		this.recId = recId;
	}

	@Override
	public String toString() {
		return "PathParamModel1 [recId=" + recId + "]";
	}	

}
