package com.employee.employeeRegistration.service.blueprint;

import com.employee.employeeRegistration.model.Employee;
import com.employee.employeeRegistration.util.ResponseMessage;

import java.util.List;

public interface IEmployeeService {

    ResponseMessage create(Employee employee);

    ResponseMessage update(Employee employee);

    ResponseMessage delete(Integer id);

    ResponseMessage findAll();

}
