package com.danrusu.drive.service;

import com.danrusu.drive.entity.Account;
import com.danrusu.drive.repository.AccountRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService {
    private final AccountRepo accountRepo;

    @Autowired
    public AccountService(AccountRepo accountRepo){
        this.accountRepo = accountRepo;
    }

    public Optional<Account> getAccountById(Long id){
        return accountRepo.findById(id);
    }

    public Account saveAccount(Account account){
        return accountRepo.save(account);
    }

    public void deleteById(Long id) {
        accountRepo.deleteById(id);
    }
}
