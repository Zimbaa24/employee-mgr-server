package com.collins.employeemgrserver.domain.service;

import com.collins.employeemgrserver.domain.core.ResourceCreationException;
import com.collins.employeemgrserver.domain.core.ResourceNotFoundException;
import com.collins.employeemgrserver.domain.model.Employee;
import com.collins.employeemgrserver.domain.repos.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepo employeeRepo;
    @Autowired
    public EmployeeServiceImpl(EmployeeRepo employeeRepo){
        this.employeeRepo = employeeRepo;
    }
    @Override
    public Employee create(Employee employee) throws ResourceCreationException {
        Optional<Employee> optional = employeeRepo.findByEmail(employee.getEmail());
        if(optional.isPresent())
            throw new ResourceCreationException("Email already exist");
        return employeeRepo.save(employee);
    }

    @Override
    public Employee getById(Long id) throws ResourceNotFoundException {
        return null;
    }

    @Override
    public Employee getByEmail(String email) throws ResourceNotFoundException {
        return null;
    }

    @Override
    public List<Employee> getAll() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee update(Long id, Employee employeeDetail) throws ResourceNotFoundException {
        return null;
    }

    @Override
    public void delete(Long id) throws ResourceNotFoundException {

    }
}
