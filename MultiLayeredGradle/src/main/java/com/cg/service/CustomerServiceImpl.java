package com.cg.service;

import java.util.List;

import com.cg.model.Customer;
import com.cg.repository.CustomerRepository;
import com.cg.repository.CustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	@Override
	public List<Customer> findAll(){
		
		CustomerRepository customerRepository=new CustomerRepositoryImpl();
		
		return customerRepository.findAll();
		
	}

}
