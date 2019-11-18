package com.rest.api.service3;

import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ListDataValidator implements ConstraintValidator<ListValidate,List<String>>
{

	@Override
	public boolean isValid(List<String> arg0, ConstraintValidatorContext arg1) {
		
		if(arg0.size()>0)
		{
			for (String str : arg0) {
				if(str.matches("^[a-zA-Z0-9]([\\w -]*[a-zA-Z0-9])?$"))
				{
					return true;
				}
			}
		}
		// TODO Auto-generated method stub
		return false;
	}

}
