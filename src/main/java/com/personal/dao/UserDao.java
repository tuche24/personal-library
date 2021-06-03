package com.personal.dao;

import com.personal.vo.UserVO;

public interface UserDao {

	UserVO findOneUserByUserNum(int userNum);
}
