package com.bluebank.accountmanager.services.impl;

import com.bluebank.accountmanager.model.Account;
import com.bluebank.accountmanager.repository.AccountRepository;
import com.bluebank.accountmanager.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account createAccount(Account account) {
        return this.accountRepository.save(account);
    }

    public List<Account> getAllAccountsByCustomerId(Long customerId) {
        return this.accountRepository.findAllByCustomerId(customerId);
    }

}
