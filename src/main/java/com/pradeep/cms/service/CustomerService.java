package com.pradeep.cms.service;

import java.util.List;

import com.pradeep.cms.model.Customer;

public interface CustomerService {
	boolean addCustomer(Customer customer);
	List<Customer> getAllCustomers();
		
	
}
