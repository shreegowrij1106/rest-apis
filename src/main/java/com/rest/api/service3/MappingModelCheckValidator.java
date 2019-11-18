package com.rest.api.service3;

import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MappingModelCheckValidator implements ConstraintValidator<RecordIdCheck,List<MappingModel>> {

	@Override
    public void initialize(RecordIdCheck constraintAnnotation) {

    }
	
	@Override
	public boolean isValid(List<MappingModel> arg0, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub
		
		if(arg0.isEmpty()||arg0==null||arg0.size()==0)
		{				
			return true;	
		}
	return false;

	}
}
