package com.example.springbootproject.service;

import com.example.springbootproject.model.Customer;

import java.util.List;

public interface CustomerInterface {

    public List<Customer> findAll();
    Customer findById(Long id);

    List<Customer> get(Long id,String city);
}
