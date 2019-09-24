package com.bury.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bury.dao.UserDao;
import com.bury.entity.User;
import com.bury.service.UserService;
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService{

	@Resource
	private UserDao userDao;
	@Override
	public User login(String name, String password) {
		// TODO Auto-generated method stub
		return userDao.login(name, password);
	}

}
