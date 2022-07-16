package com.collins.employeemgrserver.domain.repos;

import com.collins.employeemgrserver.domain.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    Optional<Employee> findByEmail(String email);
}
