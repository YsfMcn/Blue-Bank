package com.bluebank.accountmanager.services.impl;

import com.bluebank.accountmanager.model.Account;
import com.bluebank.accountmanager.model.Transaction;
import com.bluebank.accountmanager.repository.AccountRepository;
import com.bluebank.accountmanager.services.AccountService;
import com.bluebank.accountmanager.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private TransactionService transactionService;

    @Override
    public Account createAccount(Account account) {
        Account newAccount = this.accountRepository.save(account);
        if (newAccount.getBalance() > 0) {
            Transaction transaction = new Transaction();
            transaction.setAccount(newAccount);
            transaction.setTransactionAmount(newAccount.getBalance());
            transactionService.createTransaction(transaction);
        }
        return newAccount;
    }

    public List<Account> getAllAccountsByCustomerId(Long customerId) {
        return this.accountRepository.findAllByCustomerId(customerId);
    }

}
