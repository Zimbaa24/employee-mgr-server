package com.collins.employeemgrserver.domain.service;

import com.collins.employeemgrserver.domain.core.ResourceCreationException;
import com.collins.employeemgrserver.domain.core.ResourceNotFoundException;
import com.collins.employeemgrserver.domain.model.Customer;

import java.util.List;

public interface CustomerService {
    Customer create(Customer customer) throws ResourceCreationException;
    Customer getById(Long id) throws ResourceNotFoundException;
    Customer getByEmail(String email) throws ResourceNotFoundException;
    List<Customer> getAll();
    Customer update(Long id, Customer customerDetail) throws ResourceNotFoundException;
    void delete(Long id) throws ResourceNotFoundException;

}
