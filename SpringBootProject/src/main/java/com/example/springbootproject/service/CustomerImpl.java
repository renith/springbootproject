package com.example.springbootproject.service;

import com.example.springbootproject.model.Customer;
import com.example.springbootproject.repository.CustomerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class CustomerImpl implements CustomerInterface{

    private final CustomerRepository customerRepository;
    public CustomerImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id).orElseThrow(() -> new RuntimeException("Customer not found with id: " + id));
    }

    public List<Customer> get(Long id, String city){
        return customerRepository.get(id,city);
    }
}
