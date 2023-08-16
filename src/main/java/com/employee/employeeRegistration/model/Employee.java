package com.employee.employeeRegistration.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee")
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    private String sName;
    @Column
    private String fname;
    @Column
    private String mName;
    @Column
    private String lName;
    @Column
    private String mobile;
    @Column
    private String address;
    @Column
    private String designation;
    @Column
    private String reportingManager;
    @Column
    private String companyEmail;
    @Column
    private String DOA;
    @Column
    private String accnum;
    @Column
    private String bank;
    @Column
    private String branch;
    @Column
    private String BOD;
    @Column
    private String gender;
    @Column
    private String age;
    @Column
    private String password;
    @Column
    private String note;


}
