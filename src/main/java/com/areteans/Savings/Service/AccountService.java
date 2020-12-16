package com.areteans.Savings.Service;

import com.areteans.Savings.Models.Account;
import com.areteans.Savings.Repositories.AccountRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class AccountService {
    private final JdbcTemplate jdbcTemplate;
    private final AccountRepository accountRepository;

    public AccountService(JdbcTemplate jdbcTemplate, AccountRepository accountRepository) {
        this.jdbcTemplate = jdbcTemplate;
        this.accountRepository = accountRepository;
    }
    public Account saveAcc(Account account){
        return accountRepository.save(account);
    }
}