package com.microserviceFirst.mapper;

import com.microserviceFirst.dto.AccountDto;
import com.microserviceFirst.entity.Account;

public final class AccountMapper {

    public static AccountDto mapToAccountsDto(Account accounts, AccountDto accountsDto) {
        accountsDto.setAccountNumber(accounts.getAccountNumber());
        accountsDto.setAccountType(accounts.getAccountType());
        accountsDto.setBranchAddress(accounts.getBranchAddress());
        return accountsDto;
    }

    public static Account mapToAccounts(AccountDto accountsDto, Account accounts) {
        accounts.setAccountNumber(accountsDto.getAccountNumber());
        accounts.setAccountType(accountsDto.getAccountType());
        accounts.setBranchAddress(accountsDto.getBranchAddress());
        return accounts;
    }
}
