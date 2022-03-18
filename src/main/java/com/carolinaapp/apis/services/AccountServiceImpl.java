package com.carolinaapp.apis.services;

import com.carolinaapp.apis.entities.Account;
import com.carolinaapp.apis.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AccountServiceImpl implements AccountServices{
    @Autowired
    AccountRepository accountRepository;

    @Override
    public Account getAccountInfo(Long id) {
        return accountRepository.getById(id);
    }

    @Override
    public void safeAccountInfo(Account account) {
        accountRepository.save(account);
    }
}
