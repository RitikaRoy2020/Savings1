package com.areteans.Savings.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "account")
@Getter
@Setter
@AllArgsConstructor
public class Account {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long cusid;
    private double balance;
    private double rate;
}