package com.danrusu.drive.controller;

import com.danrusu.drive.entity.Account;
import com.danrusu.drive.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService){
        this.accountService = accountService;
    }

    @PostMapping
    public Account createAccount(@RequestBody Account account){
        return accountService.saveAccount(account);
    }

    @GetMapping("/{id}")
    public Optional<Account> getAccountById(@PathVariable Long id){
        Optional<Account> account = accountService.getAccountById(id);
        return account;
    }

    @GetMapping
    public List<Account> getAllAccounts(){
        List<Account> accounts = accountService.findAll();
        return accounts;
    }

    @DeleteMapping("/{id}")
    public void deleteAccountById(@PathVariable Long id){
        accountService.deleteById(id);
    }

}
