package com.bury.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.bury.dao.UserDao;
import com.bury.entity.User;
@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{

	private final String namespace="User";
	@Override
	public User login(String name, String password) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", name);
		map.put("password", password);
		return getSqlSession().selectOne(namespace+".login",map);
	}

}
