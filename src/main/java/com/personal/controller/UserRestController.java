package com.personal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.personal.service.UserService;

@RestController
public class UserRestController {

	@Autowired
	UserService userService = new UserService();
	
	@GetMapping("user/{userNum}")
	public String findOneUserByUserNum(@PathVariable("userNum") int userNum) {
		System.out.println("[TRACE] findOneUser");
		
		userService.findOneUserByUserNum(userNum);
		
		return null;
	}
}
