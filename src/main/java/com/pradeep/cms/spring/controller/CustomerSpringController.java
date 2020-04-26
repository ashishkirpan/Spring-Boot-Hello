package com.pradeep.cms.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pradeep.cms.model.Customer;
import com.pradeep.cms.service.CustomerService;

@Controller
public class CustomerSpringController {

	@Autowired
	// dependency
	private CustomerService cs;

	public CustomerSpringController() {
		System.out.println("CustomerSpringController created...");
	}

	@RequestMapping("/getallcustomers")
	public ModelAndView getAllCustomers() {
		return new ModelAndView("customerList", "customers", cs.getAllCustomers());

	}

	@RequestMapping("/new")
	public String newCustomer(ModelMap map) {

		map.addAttribute("customers", cs.getAllCustomers());

		map.addAttribute("customer", new Customer());

		return "addCustomer";

	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addCustomer(@ModelAttribute("customer") Customer customer) {

		cs.addCustomer(customer);

		return new ModelAndView("customerList", "customers", cs.getAllCustomers());

	}

}
