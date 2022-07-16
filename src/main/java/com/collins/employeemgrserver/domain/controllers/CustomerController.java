package com.collins.employeemgrserver.domain.controllers;


import com.collins.employeemgrserver.domain.model.Customer;
import com.collins.employeemgrserver.domain.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping
    public ResponseEntity<List<Customer>> getAll(){
        List<Customer> customers = customerService.getAll();
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Customer> create(Customer customer){
        customer = customerService.create(customer);
        return new ResponseEntity<>(customer, HttpStatus.CREATED);
    }
}
