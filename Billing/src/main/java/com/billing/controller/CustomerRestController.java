package com.billing.controller;

import java.util.List;


import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.billing.jpa.Customers;
import com.billing.service.CustomerService;
import com.billing.service.ICustomerService;
@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
public class CustomerRestController {
	
	private static Logger logger = LogManager.getLogger(CustomerRestController.class);


	 @Autowired
	    ICustomerService customerService;
	
	@GetMapping("/customers")
	private List<Customers> getCustomers() {
		return this.customerService.getCustomers();
	}
	
	@GetMapping("/customer/{id}")
	private Optional<Customers> getCustomer(@PathVariable Long customerId) {
		return this.customerService.getCustomer(customerId);
	}
	
	@PostMapping("/customer")
	private Customers createCustomer(@RequestBody Customers customer) {
		logger.info("Customer Created!");
		return this.customerService.createCustomer(customer);
	}
	
	@PutMapping("/customer/{id}")
	private Customers updateCustomer(@PathVariable Long customerId, @RequestBody Customers customer) {
		return this.customerService.updateCustomer(customer);
	}
	
	
//	@Autowired
//	UserRepository userRepository;
//	
//	@GetMapping("/users")
//	private List<User> getUsers(){
//		return userRepository.findAll();
//	}
//	
//	@GetMapping("/user/{id}")
//	private Optional<User> getUserById(@PathVariable Long id) {
//		return userRepository.findById(id);
//	}
//	
//	@DeleteMapping("/user/{id}")
//	private boolean deleteById(@PathVariable Long id) {
//		userRepository.deleteById(id);
//		return true;
//	}
//	
//	@PostMapping("/user")
//	private User postUser(@RequestBody User user) {
//		logger.info(user.getfName());
//		logger.info(user.getlName());
//		return userRepository.save(user);
//	}
//	
//	@PutMapping("/user")
//	private User putUser(@RequestBody User user) {
//		return userRepository.save(user);
//	}
}
