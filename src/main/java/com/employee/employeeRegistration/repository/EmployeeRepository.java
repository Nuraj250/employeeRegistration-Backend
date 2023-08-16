package com.employee.employeeRegistration.repository;

import com.employee.employeeRegistration.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    Optional<Employee> findById(Integer id);
}
