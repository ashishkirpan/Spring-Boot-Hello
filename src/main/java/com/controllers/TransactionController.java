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

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.pradeep.cms.model.Customer;
import com.pradeep.cms.service.CustomerService;


@RestController
@RequestMapping("/transaction")
public class TransactionController {

	@Autowired
	private CustomerService cs;
	
	@RequestMapping(value = "/callback/{networkId}", method = RequestMethod.GET)
	public ModelAndView processResponse (@PathVariable("networkId") String networkId, HttpServletRequest request) throws IOException { 
		ModelAndView mv = new ModelAndView("welcome", "message", "Welcome To Spring Web MVC at Sotedge");
		
		Customer customer = handleRequest(request);	
		customer.setNetworkId(networkId);
		cs.addCustomer(customer);
		
		return mv;
	}
	
	@RequestMapping(value = "/showData", method = RequestMethod.GET)
	public ModelAndView getAllCustomers() {
		
		ModelAndView mv = new ModelAndView("customerList", "message", "Welcome");
		
		mv.addObject("customers", cs.getAllCustomers());
		
		return mv;
	}
	
	
	public Customer handleRequest(HttpServletRequest req) throws IOException {
		
		Customer customer = new Customer();
		customer.setId(System.currentTimeMillis());
        Enumeration<String> parameterNames = req.getParameterNames();
        
        StringBuffer buffer = new StringBuffer();
        
        while (parameterNames.hasMoreElements()) {
 
        	
            String paramName = parameterNames.nextElement();
            buffer.append(paramName);
            buffer.append("[");
            
            String[] paramValues = req.getParameterValues(paramName);
            for (int i = 0; i < paramValues.length; i++) {
            	
                String paramValue = paramValues[i];
                buffer.append(paramValue);
                buffer.append(",");
            }
            buffer.append("]");
        }
 
        customer.setData(buffer.toString());
        
        return customer;
    }
}
