package com.bury.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bury.entity.Category;
import com.bury.entity.User;
import com.bury.service.CategoryService;
import com.bury.service.UserService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CategoryService service = (CategoryService)context.getBean("categoryService");
//		UserService service = (UserService)context.getBean("userService");
		/*
		User user = new User();
		user.setName("张全");
		user.setPassword("0513");
		service.add(user);
		*/
		/*
		User user = new User();
		user.setId(7);
		user.setName("kz");
		user.setPassword("0304");
		service.update(user);
		*/
//		service.deleteById(User.class, 10);
		
		Category ca = new Category();
		ca.setName("国产手机s");
		service.add(ca);
		System.out.println(ca.getId());
		
//		service.deleteById(Category.class, 89);
		/*
		List<Category> list = service.queryByPage(Category.class, 1,10);
		for (Category Category : list) {
			System.out.println(Category);
		}
		*/
	}

}
