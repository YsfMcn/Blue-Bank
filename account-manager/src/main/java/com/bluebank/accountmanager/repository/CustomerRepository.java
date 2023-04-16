package com.bluebank.accountmanager.repository;

import com.bluebank.accountmanager.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
