package com.capgemini.view;

import com.cg.service.CustomerService;
import com.cg.service.CustomerServiceImpl;

public class MainApp {
	
	public static void main(String args[]) {
		CustomerService customerService=new CustomerServiceImpl();
		
		System.out.println(customerService.findAll().get(0).getFirstName()+" "+customerService.findAll().get(0).getLastName());
	}

}
