package com.rest.api.service3;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

// TODO: Auto-generated Javadoc
/**
 * @author shreegowri.j
 * The Interface MappingModelCheck.
 */
@Target({ElementType.FIELD,ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = { RecordIdCheckValidator.class })
@Documented
public @interface MappingModelCheck 
{
	
	/**
	 * Message.
	 *
	 * @return the string
	 */
	String message();
    
    /**
     * Groups.
     *
     * @return the class[]
     */
    Class<?>[] groups() default { };
    
    /**
     * Payload.
     *
     * @return the class<? extends payload>[]
     */
    Class<? extends Payload>[] payload() default { };
}
