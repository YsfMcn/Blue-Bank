package com.bluebank.accountmanager.services.impl;

import com.bluebank.accountmanager.model.Customer;
import com.bluebank.accountmanager.repository.CustomerRepository;
import com.bluebank.accountmanager.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }
}
