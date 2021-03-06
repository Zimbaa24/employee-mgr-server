package com.collins.employeemgrserver.domain.service;

import com.collins.employeemgrserver.domain.core.ResourceCreationException;
import com.collins.employeemgrserver.domain.core.ResourceNotFoundException;
import com.collins.employeemgrserver.domain.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee create(Employee employee) throws ResourceCreationException;
    Employee getById(Long id) throws ResourceNotFoundException;
    Employee getByEmail(String email) throws ResourceNotFoundException;
    List<Employee> getAll();
    Employee update(Long id, Employee employeeDetail) throws ResourceNotFoundException;
    void delete(Long id) throws ResourceNotFoundException;

}
