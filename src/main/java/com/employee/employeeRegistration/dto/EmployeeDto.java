package com.employee.employeeRegistration.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;
@Setter
@Getter
@ToString
@NoArgsConstructor
public class EmployeeDto implements Serializable {

    private Integer id;
    private String sName;
    private String fname;
    private String mName;
    private String lName;
    private String mobile;
    private String address;
    private String designation;
    private String reportingManager;
    private String companyEmail;
    private String DOA;
    private String accnum;
    private String bank;
    private String branch;
    private String BOD;
    private String gender;
    private String age;
    private String password;
    private String note;
}
