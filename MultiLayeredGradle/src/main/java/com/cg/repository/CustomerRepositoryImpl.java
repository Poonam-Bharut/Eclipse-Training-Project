package com.cg.repository;

import java.util.ArrayList;
import java.util.List;

import com.cg.model.Customer;

public class CustomerRepositoryImpl implements CustomerRepository {
	
	@Override
	public List<Customer> findAll(){
		
		List<Customer> customers=new ArrayList<Customer>();
		
		Customer customer=new Customer();
		customer.setFirstName("Poonam");
		customer.setLastName("Bharut");
		
		customers.add(customer);
		
		return customers;
	}

}
