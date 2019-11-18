package com.rest.api.service3;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

//@Target({ ElementType.FIELD, ElementType.ANNOTATION_TYPE })
@Target({ElementType.FIELD,ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = { RecordIdCheckValidator.class })
@Documented
public @interface RecordIdCheck {

	    String message();
	    Class<?>[] groups() default { };
	    Class<? extends Payload>[] payload() default { };
}
