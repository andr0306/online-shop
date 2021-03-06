package com.diplom.validator;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

// перевірка чи існує емейл
@Retention(RUNTIME)
@Target({ FIELD, METHOD })
@Constraint(validatedBy = {CheckIfUserEmailExistsValidator.class})
public @interface CheckIfUserEmailExists {
	
	String message () default "Email already exists";
	Class<?>[] groups() default {};
	Class<? extends Payload >[] payload() default {};
}
