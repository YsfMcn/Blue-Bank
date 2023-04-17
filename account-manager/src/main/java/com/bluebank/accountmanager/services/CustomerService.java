package com.bluebank.accountmanager.services;

import com.bluebank.accountmanager.model.Customer;

public interface CustomerService {
    Customer findById(Long id);
}
