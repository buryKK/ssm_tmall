package com.bury.service;

import com.bury.entity.Category;

public interface CategoryService extends BaseService<Category> {

	/**
	 * 批量删除
	 * 
	 * @param ids
	 * @return
	 */
	public int deleteMore(String ids);

	/**
	 * 根据商品编号查询类别
	 * 
	 * @param pid
	 * @return
	 */
	public Category queryByPid(int pid);

	/**
	 * 根据属性编号查询类别
	 * 
	 * @param pid
	 * @return
	 */
	public Category queryByPropertyId(int pid);
}
