package com.personal.dao;

import java.util.List;

import com.personal.vo.UserVO;

public interface UserDao {

	UserVO findOneUserByUserNum(int userNum);
	
	List<UserVO> findAllUser();
}
