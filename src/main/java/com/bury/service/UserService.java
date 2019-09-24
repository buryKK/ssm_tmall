package com.bury.service;

import com.bury.entity.User;

public interface UserService extends BaseService<User>{

	public User login(String name,String password);
}
