package com.carolinaapp.apis.apis;

import com.carolinaapp.apis.entities.Account;
import com.carolinaapp.apis.services.AccountServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apis/account")
public class AccountAPI {
    @Autowired
    AccountServices accountServices;

    @GetMapping("/")
    public Account getAccountInfo(Long id){
        return accountServices.getAccountInfo(id);
    }

    @PostMapping(path = "/{id}")
    public void saveAccountInfo (@RequestBody Account account){accountServices.safeAccountInfo(account);}

}
