package com.ysbc.front.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@RequestMapping("/")
	public String showMain() {
		System.out.println("main");
		return "main";
	}
	
	
	
	
}
