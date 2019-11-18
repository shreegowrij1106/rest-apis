package com.rest.api.service3;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class RecordIdCheckValidator implements ConstraintValidator<RecordIdCheck,String> {

	@Override
    public void initialize(RecordIdCheck constraintAnnotation) {

    }   

	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub
		if(arg0.isEmpty() || arg0==null||arg0.matches("\\d+(:\\d+)"))
		{
			return true;
		}			
		return false;
	}
}

