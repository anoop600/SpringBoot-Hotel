package com.mindtree.globalSummit.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.globalSummit.entity.Customer;
import com.mindtree.globalSummit.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	CustomerService customerService;

	@RequestMapping(method = RequestMethod.POST, value = "/addCustomer")
	public void addCustomer(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/getCustomer/{customerId}")
	public Optional<Customer> getHotelById(@PathVariable int customerId) {
		return customerService.getCustomer(customerId);
	}

}