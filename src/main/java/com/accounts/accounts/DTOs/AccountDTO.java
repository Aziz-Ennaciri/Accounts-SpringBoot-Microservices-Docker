package com.accounts.accounts.DTOs;

import lombok.Data;

@Data
public class AccountDTO {

    private Long accountNumber;
    private String accountType;
    private String branchAddress;
}