package com.bluebank.accountmanager.controller;

import com.bluebank.accountmanager.dto.UserInfoDTO;
import com.bluebank.accountmanager.model.Account;
import com.bluebank.accountmanager.model.Customer;
import com.bluebank.accountmanager.model.Transaction;
import com.bluebank.accountmanager.services.AccountService;
import com.bluebank.accountmanager.services.CustomerService;
import com.bluebank.accountmanager.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private AccountService accountService;

    @Autowired
    private TransactionService transactionService;


    @GetMapping("/{id}")
    public ResponseEntity<UserInfoDTO> getCustomerInfo(@PathVariable Long id) {
        UserInfoDTO userInfoDTO = new UserInfoDTO();
        Customer customer = customerService.findById(id);
        List<Account> accountList = accountService.getAllAccountsByCustomerId(id);
        List<Transaction> transactionList = new ArrayList<>();
        accountList.forEach(account -> transactionList.addAll(transactionService.getAllTransactionByAccountId(account.getId())));
        userInfoDTO.setCustomerName(customer.getName());
        userInfoDTO.setCustomerSurname(customer.getSurname());
        userInfoDTO.setTotalBalance(accountList.stream().mapToLong(Account::getBalance).sum());
        userInfoDTO.setTransactionList(transactionList);
        return ok(userInfoDTO);
    }

}
