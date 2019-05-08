package com.diplom.mapper;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

import com.diplom.domain.RegisterRequest;
import com.diplom.domain.UserProfileRequest;
import com.diplom.entity.UserEntity;
import com.diplom.entity.enumeration.Role;

public interface UserMapper {

	public static User toSecurityUser(UserEntity entity) {
		return new User(entity.getEmail(), entity.getPassword(), AuthorityUtils.createAuthorityList(String.valueOf(entity.getRole())));
	}
	
	public static UserEntity registerToEntity(RegisterRequest request) {
		
		UserEntity entity = new UserEntity();
		entity.setEmail(request.getEmail());
		entity.setPassword(request.getPassword());
		entity.setRole(Role.ROLE_USER);
		
		return entity;
	}
	public static UserProfileRequest entityToUserProfile(UserEntity entity) {
		UserProfileRequest request = new UserProfileRequest();
		request.setId(entity.getId());
		request.setEmail(entity.getEmail());
		request.setFirstname(entity.getFirstName());
		request.setLastname(entity.getLastName());
		request.setAge(entity.getAge());
		request.setImagePath(entity.getImagePath());
		request.setRole(entity.getRole());
		
		
		return request;
		
		
	}
}
