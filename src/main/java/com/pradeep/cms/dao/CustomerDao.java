package com.pradeep.cms.dao;

import java.util.List;

import com.pradeep.cms.model.Customer;

public interface CustomerDao {

	boolean addCustomer(Customer customer);
	List<Customer> getAllCustomers();
		
	
}
