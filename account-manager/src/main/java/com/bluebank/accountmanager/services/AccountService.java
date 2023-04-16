package com.bluebank.accountmanager.services;

import com.bluebank.accountmanager.model.Account;

import java.util.List;

public interface AccountService {

    Account createAccount(Account account);

    List<Account> getAllAccountsByCustomerId(Long customerId);
}
