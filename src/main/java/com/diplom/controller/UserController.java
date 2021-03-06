//package com.diplom.controller;
//
//import java.io.IOException;
//import java.security.Principal;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.diplom.entity.UserEntity;
//import com.diplom.mapper.UserMapper;
//import com.diplom.service.UserService;
//import com.diplom.service.utils.CustomFileUtils;
//
//@Controller
//@RequestMapping({"/user","/admin"})
//public class UserController {
//	
//	@Autowired UserService userService;
//	
//	@GetMapping
//	@PreAuthorize("hasAnyRole('ADMIN','USER')")
//	public String showProfile(Model model , Principal princapal) throws IOException{
//		UserEntity user = userService.findUserByEmail(princapal.getName());
//		user.setImagePath(CustomFileUtils.getImage("user_"+user.getId(),user.getImagePath()));
//		model.addAttribute("userProfile",UserMapper.entityToUserProfile(user));
//		return "profile";
//	}
//}
