package com.bury.dao;

import com.bury.entity.User;

public interface UserDao extends BaseDao<User>{

	public User login(String name,String password);
}
