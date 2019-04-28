package com.example.practice.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author Dinesh
 *
 */
@Controller
public class TestController {

	List<String>customers;
	
	@RequestMapping(value="/")
	public String getResponse(Map<String, Object> model) {
		return "home";
	}
	
	@RequestMapping("/customer")
	public String customer(Map<String, Object> model) {
		customers = new ArrayList<String>();
		customers.add("MetLife");
		customers.add("BrightHouse");
		model.put("cust",customers);
		return "customer";
	}
	@RequestMapping(value="/customer",method=RequestMethod.POST)
	public String addCustomer(String customer,Map<String, Object> model) {
		if(!customer.equals(""))
		customers.add(customer);
		return "customer";
	}

}
