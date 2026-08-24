package com.example.springbootproject.controller;

import com.example.springbootproject.model.Customer;
import com.example.springbootproject.service.CustomerInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/api")
@Tag(name = "Customer API", description = "Customer Management APIs")
public class CustomerController {

    @Autowired
    private CustomerInterface customerInterface;

    @Value("${server.port}")
    private int port;

    @GetMapping("/get")
    @Operation(summary = "Get all customer details")
    public List<Customer> get(){
        return customerInterface.findAll();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return customerInterface.findById(id);
    }

    @PostMapping("/create")
    public ResponseEntity<Customer> create(@RequestBody Customer customer){
        return ResponseEntity.ok(customer);
    }

    @GetMapping("/{id}/{city}")
    public List<Customer> getCustomer(@PathVariable Long id,@PathVariable String city) {
        return customerInterface.get(id, city);
    }


    @GetMapping("get/loadbalancing")
    public String invokePaymentService() {
        System.out.println("port:: "+port);
        String response = "port::"+port;
        return response;
    }


}
