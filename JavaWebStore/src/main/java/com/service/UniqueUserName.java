package com.service;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;



@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UserNameValidator.class)
public @interface UniqueUserName {
	
	String message() default "Already exist";
	Class<?>[] groups() default {};
	
	Class<? extends Payload>[] payload() default {};
	
}
