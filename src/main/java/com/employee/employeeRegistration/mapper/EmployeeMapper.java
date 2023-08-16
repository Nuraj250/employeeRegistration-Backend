package com.employee.employeeRegistration.mapper;

import com.employee.employeeRegistration.dto.EmployeeDto;
import com.employee.employeeRegistration.model.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EmployeeMapper {
    Employee toEmployee(EmployeeDto employeeDto) ;

    List<EmployeeDto> toEmployeeDtoList(List<Employee> employees);
}
