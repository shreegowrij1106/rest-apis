package com.rest.api.service3;

import java.util.Collections;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CollectionValidator implements ConstraintValidator<CollectionValidate,Collections> {

	@SuppressWarnings("unchecked")
	@Override
	public boolean isValid(Collections arg0, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub
		
		if(arg0 instanceof List<?>)
		{
			if(((List<String>) arg0).size() >0)
			{
				List<String> stringDataList=(List<String>) arg0;
				for (String str : stringDataList) {
					
					if(str.matches("^[a-zA-Z0-9]([\\w -]*[a-zA-Z0-9])?$"))
					{
						return true;
					}
				}
			}
			
		}
		return false;
	}

}
