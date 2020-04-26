/*******************************************************
 * Copyright (C) 2020 Ashish Kirpan <ashishkirpan@gmail.com>
 * 
 * This file is part of "Society Management System".
 * 
 * "Society Management System" can not be copied and/or distributed without the express
 * permission of Ashish Kirpan
 * 
 * @auther 	Ashish Kirpan
 * @date 	Apr 26, 2020 3:46:05 PM
 *******************************************************/

package com.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("/transaction")
public class TransactionController {

	@RequestMapping(value = "/callback", method = RequestMethod.GET)
	public ModelAndView processResponse (HttpServletRequest request) { 
		ModelAndView mv = new ModelAndView("welcome", "message", "Welcome To Spring Web MVC at Sotedge");
		
		mv.addObject("offer_id", request.getAttribute("offer_id"));
		mv.addObject("offer_name", request.getParameter("offer_name"));
		
		return mv;
	}
	
}
