package com.ysbc.front.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/join")
	public String userJoin() {
		System.out.println("join");
		return "user/join";
	}
	
	@RequestMapping("/login")
	public String userlogin() {
		System.out.println("login");
		return "user/login";
	}
}
