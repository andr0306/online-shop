package com.rubchuk.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rubchuk.service.UserService;

@Component
public class CheckIfUserEmailExistsValidator implements ConstraintValidator<CheckIfUserEmailExists, String>{

	@Autowired private UserService userService;
	
	@Override
	public void initialize(CheckIfUserEmailExists arg0) {
	
		
	}

	@Override
	public boolean isValid(String email, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		return userService.findUserByEmail(email)!=null?false : true;
	}

}
