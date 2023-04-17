package com.bluebank.accountmanager.services.impl;

import com.bluebank.accountmanager.model.Transaction;
import com.bluebank.accountmanager.repository.TransactionRepository;
import com.bluebank.accountmanager.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public Transaction createTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    @Override
    public List<Transaction> getAllTransactionByAccountId(Long accountId) {
        return transactionRepository.findAllByAccountId(accountId);
    }
}
