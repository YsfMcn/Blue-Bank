package com.bluebank.accountmanager.services;

import com.bluebank.accountmanager.model.Transaction;

import java.util.List;

public interface TransactionService {
    Transaction createTransaction( Transaction transaction);
    List<Transaction> getAllTransactionByAccountId(Long accountId);
}
