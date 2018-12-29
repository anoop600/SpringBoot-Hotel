package com.mindtree.globalSummit.service.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.globalSummit.entity.Customer;
import com.mindtree.globalSummit.repository.CustomerRepository;
import com.mindtree.globalSummit.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public void addCustomer(Customer customer) {
		customerRepository.save(customer);
	}

	@Override
	public Optional<Customer> getCustomer(int id) {
		return customerRepository.findById(id);
	}

}
