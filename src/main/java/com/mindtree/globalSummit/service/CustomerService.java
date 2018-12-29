package com.mindtree.globalSummit.service;

import java.util.Optional;

import com.mindtree.globalSummit.entity.Customer;

public interface CustomerService {
	public void addCustomer(Customer customer);

	public Optional<Customer> getCustomer(int id);
}
