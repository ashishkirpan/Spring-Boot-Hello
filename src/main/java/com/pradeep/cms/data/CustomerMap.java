package com.pradeep.cms.data;

import java.util.HashMap;
import java.util.Map;

import com.pradeep.cms.model.Customer;

public enum CustomerMap {
	INSTANCE;

	private Map<String, Customer> map;

	private CustomerMap() {

		map = new HashMap<>();
		
	}

	public Map<String, Customer> getMap() {
		return map;
	}

}
