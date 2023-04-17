package com.bluebank.accountmanager.dto;

import com.bluebank.accountmanager.model.Transaction;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class UserInfoDTO {

    private String customerName;
    private String customerSurname;
    private Long totalBalance;
    private List<Transaction> transactionList;
}
