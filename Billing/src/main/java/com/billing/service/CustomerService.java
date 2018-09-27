package com.billing.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billing.jpa.Customers;
import com.billing.repositories.CustomerRepository;

@Service
public class CustomerService implements ICustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	
	public Customers createCustomer(Customers customer) {
		return customerRepository.save(customer);
	}
	
	public Customers updateCustomer(Customers customer) {
		return customerRepository.save(customer);
	}
	
	public Optional<Customers> getCustomer(Long customerId) {
		return customerRepository.findById(customerId);
	}
	
	public List<Customers> getCustomers(){		
		List<Customers> countries =  customerRepository.findAll();
        return countries;
	}
}
