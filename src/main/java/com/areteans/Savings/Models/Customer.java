package com.areteans.Savings.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="customer")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long cusid;
    private String name;
    private int age;
    private String address;
    private long num;
}