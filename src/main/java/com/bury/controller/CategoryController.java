package com.bury.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bury.entity.Category;
import com.bury.service.CategoryService;

@Controller
public class CategoryController {

	@Resource
	private CategoryService categoryService;
	@RequestMapping("/admin_category_add")
	public String add(Category category) {
		
		return "";
		
	}
	
	@RequestMapping("/admin_category_list/{currentPage}")
	public String list(@PathVariable String currentPage,Map<String, Object> map) {
		int sp=1;
		int pageSize = 5;
		int totals = categoryService.getTotals(Category.class);
		int pageCounts = totals/pageSize;
		if(totals%pageSize!=0) {
			pageCounts++;
		}
		try {
			sp = Integer.parseInt(currentPage);
		} catch (Exception e) {
			// TODO: handle exception
			sp=1;
		}
		if(sp>pageCounts) {
			sp = pageCounts;
		}
		if(sp<1) {
			sp = 1;
		}
		List<Category> list = categoryService.queryByPage(Category.class, sp, pageSize);
		map.put("totals", totals);
		map.put("sp", sp);
		map.put("pageCounts", pageCounts);
		map.put("list", list);
		return "admin/listCategory";
	}
}
