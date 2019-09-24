package com.bury.dao.impl;

import org.springframework.stereotype.Repository;

import com.bury.dao.CategoryDao;
import com.bury.entity.Category;
@Repository("categoryDao")
public class CategoryDaoImpl extends BaseDaoImpl<Category> implements CategoryDao{

	private final String namespace = "Category";
	@Override
	public int deleteMore(String ids) {
		// TODO Auto-generated method stub
		return getSqlSession().delete(namespace+".deleteMore",ids);
	}

	@Override
	public Category queryByPid(int pid) {
		// TODO Auto-generated method stub
		return getSqlSession().selectOne(namespace+".queryByPid",pid);
	}

	@Override
	public Category queryByPropertyId(int pid) {
		// TODO Auto-generated method stub
		return getSqlSession().selectOne(namespace+".queryByPropertyId",pid);
	}

}
