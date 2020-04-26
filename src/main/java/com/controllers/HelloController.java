package com.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/testspring")
@Controller
public class HelloController {

	
	public HelloController() {
		System.out.println("Hello Controller created....");
	}
	
	@RequestMapping(value="/hello")
	public String hello(){
		return "hello";
	}
	
	@RequestMapping(value="/welcome")
	public ModelAndView welcome(){
		return new ModelAndView("welcome", "message", "Welcome To Spring Web MVC at Sotedge");
	}
	
	@RequestMapping(value="/today")
	public @ResponseBody String today(){
		return "Today is :"+new Date();
	}
	
	
	
}
