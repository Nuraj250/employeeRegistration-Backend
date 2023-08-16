package com.employee.employeeRegistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@EnableGlobalMethodSecurity(securedEnabled = true)
public class EmployeeRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeRegistrationApplication.class, args);
	}

}
