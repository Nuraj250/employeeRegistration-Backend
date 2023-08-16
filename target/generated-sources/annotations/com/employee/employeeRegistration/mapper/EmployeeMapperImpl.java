package com.employee.employeeRegistration.mapper;

import com.employee.employeeRegistration.dto.EmployeeDto;
import com.employee.employeeRegistration.model.Employee;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-16T21:26:16+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.7 (Amazon.com Inc.)"
)
@Component
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public Employee toEmployee(EmployeeDto employeeDto) {
        if ( employeeDto == null ) {
            return null;
        }

        Employee employee = new Employee();

        employee.setId( employeeDto.getId() );
        employee.setSName( employeeDto.getSName() );
        employee.setFname( employeeDto.getFname() );
        employee.setMName( employeeDto.getMName() );
        employee.setLName( employeeDto.getLName() );
        employee.setMobile( employeeDto.getMobile() );
        employee.setAddress( employeeDto.getAddress() );
        employee.setDesignation( employeeDto.getDesignation() );
        employee.setReportingManager( employeeDto.getReportingManager() );
        employee.setCompanyEmail( employeeDto.getCompanyEmail() );
        employee.setDOA( employeeDto.getDOA() );
        employee.setAccnum( employeeDto.getAccnum() );
        employee.setBank( employeeDto.getBank() );
        employee.setBranch( employeeDto.getBranch() );
        employee.setBOD( employeeDto.getBOD() );
        employee.setGender( employeeDto.getGender() );
        employee.setAge( employeeDto.getAge() );
        employee.setPassword( employeeDto.getPassword() );
        employee.setNote( employeeDto.getNote() );

        return employee;
    }

    @Override
    public List<EmployeeDto> toEmployeeDtoList(List<Employee> employees) {
        if ( employees == null ) {
            return null;
        }

        List<EmployeeDto> list = new ArrayList<EmployeeDto>( employees.size() );
        for ( Employee employee : employees ) {
            list.add( employeeToEmployeeDto( employee ) );
        }

        return list;
    }

    protected EmployeeDto employeeToEmployeeDto(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        EmployeeDto employeeDto = new EmployeeDto();

        employeeDto.setId( employee.getId() );
        employeeDto.setSName( employee.getSName() );
        employeeDto.setFname( employee.getFname() );
        employeeDto.setMName( employee.getMName() );
        employeeDto.setLName( employee.getLName() );
        employeeDto.setMobile( employee.getMobile() );
        employeeDto.setAddress( employee.getAddress() );
        employeeDto.setDesignation( employee.getDesignation() );
        employeeDto.setReportingManager( employee.getReportingManager() );
        employeeDto.setCompanyEmail( employee.getCompanyEmail() );
        employeeDto.setDOA( employee.getDOA() );
        employeeDto.setAccnum( employee.getAccnum() );
        employeeDto.setBank( employee.getBank() );
        employeeDto.setBranch( employee.getBranch() );
        employeeDto.setBOD( employee.getBOD() );
        employeeDto.setGender( employee.getGender() );
        employeeDto.setAge( employee.getAge() );
        employeeDto.setPassword( employee.getPassword() );
        employeeDto.setNote( employee.getNote() );

        return employeeDto;
    }
}
