package com.personal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.dao.UserDao;
import com.personal.vo.UserVO;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public UserVO findOneUserByUserNum(int userNum) {
		
		return userDao.findOneUserByUserNum(userNum);
	}
	
	public List<UserVO> findAllUser() {
		
		return userDao.findAllUser();
	}
}
