package com.employee.employeeRegistration.service.implementation;

import com.employee.employeeRegistration.exceptions.EntityNotFoundException;
import com.employee.employeeRegistration.model.Employee;
import com.employee.employeeRegistration.repository.EmployeeRepository;
import com.employee.employeeRegistration.service.blueprint.IEmployeeService;
import lombok.*;
import com.employee.employeeRegistration.util.*;
import lombok.extern.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor(onConstructor = @__({@Autowired}))
@Slf4j
public class EmployeeService implements IEmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public ResponseMessage create(Employee employee) {
        Employee newEmployee = employeeRepository.save(employee);
        if (newEmployee != null) {
            return new ResponseMessage(200, Alerts.saveSuccess, newEmployee);
        }
        return new ResponseMessage(201, Alerts.saveFailed, null);
    }

    @Override
    public ResponseMessage update(Employee employee) {
        Employee exsistEmployee = employeeRepository.findById(employee.getId().longValue()).
                orElseThrow(() -> new EntityNotFoundException(Long.valueOf(employee.getId())));
        Employee update= employeeRepository.save(employee);
        if (update != null) {
            return new ResponseMessage(200, Alerts.updateSuccess, update);
        } else {
            return new ResponseMessage(201, Alerts.updateFailed, null);
        }
    }

    @Override
    public ResponseMessage delete(Integer id) {
        Employee deleteEmployee = (Employee) employeeRepository.findById(id).
                orElseThrow(() -> new EntityNotFoundException(Long.valueOf(id)));
        Optional<Employee> byId = employeeRepository.findById(id);
        if (byId.isEmpty()) {
            return new ResponseMessage(201, Alerts.nosuchfound, null);
        } else {
            return new ResponseMessage(200, Alerts.removeSuccess, null);
        }
    }

    @Override
    public ResponseMessage findAll() {

        List<Employee> all= employeeRepository.findAll();
        if (all.isEmpty()) {
            return new ResponseMessage(200, Alerts.ok, all);
        } else {
            return new ResponseMessage(201, Alerts.nosuchfound, null);
        }
    }
}
