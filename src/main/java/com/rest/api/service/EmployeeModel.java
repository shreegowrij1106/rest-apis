package com.rest.api.service;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


public class EmployeeModel {
	@NotNull(message="empId shouldnot be blank")
	@Pattern(regexp="\\d+",message="id must be numeric only")
	private String empid;

	//@NotEmpty(message="empName shouldnot be empty")
	@NotNull(message="empName shouldnot be null")
	@Pattern(regexp="^[a-zA-Z0-9]*$",message="id must be alphanumeric only")
	private String empName;
	
	@NotNull(message="deptName shouldnot be null")
	@Pattern(regexp="^[a-zA-Z]*$",message="id must be alphabetic only")
	private String deptName;
	
	@NotNull(message="deptId shouldnot be null")
	@Pattern(regexp="\\d+",message="id must be numeric only")
	private String deptId;
	
	public EmployeeModel() {
		super();
	}
	

	public EmployeeModel(String empid, String empName, String deptName, String deptId) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.deptName = deptName;
		this.deptId = deptId;
	}
	
	


	public String getEmpid() {
		return empid;
	}


	public void setEmpid(String empid) {
		this.empid = empid;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getDeptName() {
		return deptName;
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}


	public String getDeptId() {
		return deptId;
	}


	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}


	public String toString() {
		// TODO Auto-generated method stub
		return "[Id:"+empid+" Employee Name:"+empName+" Department Name:"+deptName+" Department Id:"+deptId+"]";
	}


}
