package com.areteans.Savings.Controller;

import com.areteans.Savings.Models.Account;
import com.areteans.Savings.Models.Customer;
import com.areteans.Savings.Service.AccountService;
import com.areteans.Savings.Service.CustomerService;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping (path = "savings")
public class CustomerController {
    private final JdbcTemplate jd;
    private final CustomerService customerService;
    private final AccountService accountService;

    public CustomerController(JdbcTemplate jd, CustomerService customerService, AccountService accountService) {
        this.jd = jd;
        this.customerService = customerService;
        this.accountService = accountService;
    }

    @PostMapping(path = "insertCustomer", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Customer insertCustomer(@RequestBody Customer customer){
        Customer op = customerService.saveCus(customer);
        return op;
    }

    @PostMapping(path = "insertAccount", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Account insertAccount(@RequestBody Account account){
        return accountService.saveAcc(account);
    }
}
