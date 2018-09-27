package com.billing.service;

import java.util.List;
import java.util.Optional;

import com.billing.jpa.Customers;

public interface ICustomerService {

	public Customers createCustomer(Customers customer);
	
	
	public Customers updateCustomer(Customers customer);

	
	public Optional<Customers> getCustomer(Long customerId);

	
	public List<Customers> getCustomers();
}
