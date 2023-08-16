package com.employee.employeeRegistration.controller;

import com.employee.employeeRegistration.dto.EmployeeDto;
import com.employee.employeeRegistration.mapper.EmployeeMapper;
import com.employee.employeeRegistration.model.Employee;
import com.employee.employeeRegistration.service.EmployeeService;
import com.sun.istack.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/auth")
public class EmployeeController {

    private EmployeeService employeeService;

    private EmployeeMapper employeeMapper;

    @PostMapping({"/create"})
    public ResponseEntity<?> save(@RequestBody EmployeeDto employeeDto) {
        Employee employee = employeeMapper.toEmployee(employeeDto);
        employeeService.create(employee);
        return ResponseEntity.ok(employee);
    }

    @PutMapping({"/update"})
    public ResponseEntity<?> update(@RequestBody EmployeeDto employeeDto) {
        Employee employee = employeeMapper.toEmployee(employeeDto);
        employeeService.update(employee);
        return ResponseEntity.ok(employee);
    }

    @DeleteMapping({"/delete/{id}"})
    public ResponseEntity<?> delete(@NotNull @PathVariable("id") Integer id) {
        employeeService.delete(id);
        return ResponseEntity.ok(id);
    }

    @GetMapping({"/findAll"})
    public ResponseEntity<?> findAll() {
        List<Employee> employeeList = employeeService.findAll();
        return ResponseEntity.ok(employeeList);
    }
}
