package com.bury.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bury.dao.CategoryDao;
import com.bury.entity.Category;
import com.bury.service.CategoryService;
@Service("categoryService")
public class CategoryServiceImpl extends BaseServiceImpl<Category> implements CategoryService{

	@Resource
	private CategoryDao categoryDao;
	@Override
	public int deleteMore(String ids) {
		// TODO Auto-generated method stub
		return categoryDao.deleteMore(ids);
	}

	@Override
	public Category queryByPid(int pid) {
		// TODO Auto-generated method stub
		return categoryDao.queryByPid(pid);
	}

	@Override
	public Category queryByPropertyId(int pid) {
		// TODO Auto-generated method stub
		return categoryDao.queryByPropertyId(pid);
	}

}
