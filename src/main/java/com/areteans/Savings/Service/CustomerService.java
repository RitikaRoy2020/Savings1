package com.areteans.Savings.Service;

import com.areteans.Savings.Models.Customer;
import com.areteans.Savings.Repositories.CustomerRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final JdbcTemplate jdbcTemplate;
    private  final CustomerRepository customerRepository;

    public CustomerService(JdbcTemplate jdbcTemplate, CustomerRepository customerRepository) {
        this.jdbcTemplate = jdbcTemplate;
        this.customerRepository = customerRepository;
    }
    public Customer saveCus(Customer customer){
        return customerRepository.save(customer);
    }
}