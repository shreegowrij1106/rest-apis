package com.rest.api.service3;

import java.util.ArrayList;
import java.util.List;

public class CollectionModel 
{
	String label;
	@ListValidate(message="Invalid data inside list")
	List<String> values=new ArrayList<String>();
	public CollectionModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CollectionModel(String label, List<String> values) {
		super();
		this.label = label;
		this.values = values;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public List<String> getValues() {
		return values;
	}
	public void setValues(List<String> values) {
		this.values = values;
	}
	@Override
	public String toString() {
		return "CollectionModel [label=" + label + ", values=" + values + "]";
	}

}
