package com.rubchuk.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.rubchuk.entity.UserEntity;
import com.rubchuk.repository.UserRepository;
import com.rubchuk.service.UserService;
import com.rubchuk.service.utils.CustomFileUtils;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired private UserRepository userRepository;
	@Autowired private PasswordEncoder passwordEncoder;

	@Override
	public void saveUser(UserEntity entity) {
		String password = entity.getPassword();
		entity.setPassword(passwordEncoder.encode(password));
		
		userRepository.save(entity);
		CustomFileUtils.createFolder("user+"+entity.getId());
	}

	@Override
	public UserEntity findUserById(int id) {
		return userRepository.findOne(id);
	}

	@Override
	public UserEntity findUserByEmail(String email) {
		return userRepository.findUserByEmail(email);
	}

	@Override
	public void updateUser(UserEntity entity) {
		userRepository.save(entity);
		
	}

}
