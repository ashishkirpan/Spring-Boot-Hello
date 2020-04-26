package com.pradeep.cms.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pradeep.cms.data.CustomerMap;
import com.pradeep.cms.model.Customer;

//@Component
@Repository("mapCustomerDaoImpl")
public class MapCustomerDaoImpl implements CustomerDao {

	public MapCustomerDaoImpl() {
		System.out.println("MapCustomerDaoImpl created....");
	}

	
	@Override
	public boolean addCustomer(Customer customer) {
		CustomerMap.INSTANCE.getMap().put(String.valueOf(customer.getId()), customer);
		return false;
	}


	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return new ArrayList<>(CustomerMap.INSTANCE.getMap().values());
	}

}
