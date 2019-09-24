package com.bury.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bury.entity.User;
import com.bury.service.UserService;

@Controller
public class UserController {

	@Resource
	private UserService userService;
	@RequestMapping("index")
	public String index() {
		return "../index";
	}
	@RequestMapping("loginForm")
	public String login() {
		return "fore/login";
	}
	@RequestMapping("/forelogin")
	public String login(User user,HttpSession session) {
		user = userService.login(user.getName(), user.getPassword());
		if(user!=null) {
			session.setAttribute("u", user);
			return "redirect:forehome";
		}else {
			return "redirect:loginForm";
		}
	}
	@RequestMapping("forehome")
	public String home() {
		return "fore/home";
	}
	@RequestMapping("/forelogout")
	public String logout() {
		return "redirect:loginForm";
	}
	
	
	/*
	 * 注册
	 */
	@RequestMapping("/registerForm")
	public String register() {
		return "fore/register";
	}
	@RequestMapping("/foreregister")
	public String register(User user) {
		userService.add(user);
		return "redirect:registerSuccess";
	}
	@RequestMapping("/registerSuccess")
	public String registerSuccess() {
		return "fore/registerSuccess";
	}
}
