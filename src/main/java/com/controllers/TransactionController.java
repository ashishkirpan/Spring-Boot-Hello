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


@RestController
@RequestMapping("/transaction")
public class TransactionController {

	@RequestMapping(value = "/callback", method = RequestMethod.GET)
	public void processResponse (HttpServletRequest request) { 
		System.out.println("Received request");
	}
	
}
