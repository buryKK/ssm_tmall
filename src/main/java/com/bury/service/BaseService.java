package com.bury.service;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T> {

	public void add(T t);
	public void  deleteById(Class<?> cls ,Serializable id);
	public void update(T t);
	public T queryById(Class<?> cls ,Serializable id);
	public List<T> queryAll(Class<?> cls);
	/**
	 * 业务层不一样
	 */
	public List<T> queryByPage(Class<?> cls ,int currentPage,int pageSize);
	public int getTotals(Class<?> cls );
}
