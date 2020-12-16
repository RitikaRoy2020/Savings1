package com.areteans.Savings.Controller;

import com.areteans.Savings.Models.Account;
import com.areteans.Savings.Models.Customer;
import com.areteans.Savings.Service.AccountService;
import com.areteans.Savings.Service.CustomerService;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping (path = "savings")
public class CustomerController {
    private final JdbcTemplate jd;
    private final CustomerService customerService;

    public CustomerController(JdbcTemplate jd, CustomerService customerService) {
        this.jd = jd;
        this.customerService = customerService;
    }

    @PostMapping(path = "insertCustomer", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Customer insertCustomer(@RequestBody Customer customer){
        Customer op = customerService.saveCus(customer);
        return op;
    }

    @DeleteMapping(value = "deleteCustomer/{cusid}")
    public void deleteCustomer(@PathVariable("cusid") Long cusid){
        customerService.delCus(cusid);
        System.out.println("Deleted record of "+cusid);
    }

    @GetMapping(path = "getCustomer", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Customer getCustomer(@RequestParam("cusid") Long cusid){
        return this.customerService.getDetails(cusid);
    }

}
