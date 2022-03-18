package com.carolinaapp.apis.services;

import com.carolinaapp.apis.entities.Account;

public interface AccountServices {
    Account getAccountInfo(Long id);
    void safeAccountInfo(Account account);
}
