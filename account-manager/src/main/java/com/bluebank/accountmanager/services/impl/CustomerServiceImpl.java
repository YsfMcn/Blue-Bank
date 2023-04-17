package com.bluebank.accountmanager.services.impl;

import com.bluebank.accountmanager.exception.ResourceNotFoundException;
import com.bluebank.accountmanager.model.Customer;
import com.bluebank.accountmanager.repository.CustomerRepository;
import com.bluebank.accountmanager.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer findById(Long id) {
        return customerRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Customer not exist with id :" + id));
    }
}
