package com.bluebank.accountmanager.dto;

import com.bluebank.accountmanager.model.Account;
import com.bluebank.accountmanager.model.Customer;
import com.bluebank.accountmanager.model.Transaction;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class UserInfoDTO {
    private Customer customer;
    private List<Account> accountList;
    private List<Transaction> transactionList;
}
