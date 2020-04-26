package com.pradeep.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.pradeep.cms.dao.CustomerDao;
import com.pradeep.cms.model.Customer;

@Service("customerServiceImpl")
public class CustomerServiceImpl implements CustomerService {

	@Qualifier("mapCustomerDaoImpl")
	@Autowired
	// dependency
	private CustomerDao customerDao;

	public CustomerServiceImpl() {
		System.out.println("CustomerServiceImpl created....");
	}

	@Override
	public boolean addCustomer(Customer customer) {
		customerDao.addCustomer(customer);
		return false;
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerDao.getAllCustomers();
	}

}
