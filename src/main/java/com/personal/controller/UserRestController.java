package com.personal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personal.service.UserService;
import com.personal.vo.UserVO;

@RestController
@RequestMapping("/rest")
public class UserRestController {

	@Autowired
	UserService userService = new UserService();
	
	@GetMapping("/user/{userNum}")
	public UserVO findOneUserByUserNum(@PathVariable("userNum") int userNum) {
		System.out.println("[TRACE] findOneUserByUserNum");
		
		UserVO userVO = userService.findOneUserByUserNum(userNum);
		
		return userVO;
	}
	
	@GetMapping("/user")
	public List<UserVO> findAllUser() {
		System.out.println("[TRACE] findAllUser");
		
		List<UserVO> userList = userService.findAllUser();
		
		return userList;
	}
}
