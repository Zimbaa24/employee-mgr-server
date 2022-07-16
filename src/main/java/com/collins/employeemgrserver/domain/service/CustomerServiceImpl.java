package com.collins.employeemgrserver.domain.service;

import com.collins.employeemgrserver.domain.core.ResourceCreationException;
import com.collins.employeemgrserver.domain.core.ResourceNotFoundException;
import com.collins.employeemgrserver.domain.model.Customer;
import com.collins.employeemgrserver.domain.repos.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CustomerServiceImpl implements CustomerService{

    private CustomerRepo customerRepo;
    @Autowired
    public CustomerServiceImpl(CustomerRepo customerRepo){
        this.customerRepo = customerRepo;
    }

    @Override
    public Customer create(Customer customer) throws ResourceCreationException {
        Optional<Customer> optional =customerRepo.findByEmail(customer.getEmail());
        if(optional.isPresent())
            throw new ResourceCreationException("Email already exist");
        return customerRepo.save(customer);
    }

    @Override
    public Customer getById(Long id) throws ResourceNotFoundException {
        return null;
    }

    @Override
    public Customer getByEmail(String email) throws ResourceNotFoundException {
        return null;
    }

    @Override
    public List<Customer> getAll() {
        return customerRepo.findAll();
    }

    @Override
    public Customer update(Long id, Customer customerDetail) throws ResourceNotFoundException {
        return null;
    }

    @Override
    public void delete(Long id) throws ResourceNotFoundException {

    }
}
