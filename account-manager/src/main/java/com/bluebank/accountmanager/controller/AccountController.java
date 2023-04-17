package com.bluebank.accountmanager.controller;

import com.bluebank.accountmanager.dto.UserInputDTO;
import com.bluebank.accountmanager.model.Account;
import com.bluebank.accountmanager.model.Customer;
import com.bluebank.accountmanager.services.AccountService;
import com.bluebank.accountmanager.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.ok;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private CustomerService customerService;

    @PostMapping()
    public ResponseEntity<Account> createAccount(@RequestBody UserInputDTO userInputDTO) {
        Account account = new Account();
        Customer customer = customerService.findById(userInputDTO.getCustomerID());
        account.setCustomer(customer);
        account.setBalance(userInputDTO.getInitialCredit());
        return ok(accountService.createAccount(account));
    }
}
