package com.rest.api.service3;

import javax.validation.constraints.Pattern;

public class ShreeModel 
{
	@Pattern(regexp="#\\d+(:\\d+)",message="Invalid name")
	private String empName="";

	@RecordIdCheck(message="Invalid Record Id")
	private String empId="";
	
	public ShreeModel(String empName, String empId) {
		super();
		this.empName = empName;
		this.empId = empId;
	}
	public ShreeModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmpName() {
		
		return empName;
	}
	public void setEmpName(String empName) {
			this.empName = empName;	
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId=empId;
	}
	@Override
	public String toString() {
		return "ShreeModel [empName=" + empName + ", empId=" + empId + "]";
	}	

}
