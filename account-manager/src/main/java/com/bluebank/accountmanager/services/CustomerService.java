package com.bluebank.accountmanager.services;

import com.bluebank.accountmanager.model.Customer;

import java.util.Optional;


public interface CustomerService {
    Optional<Customer> findById(Long id);
}
