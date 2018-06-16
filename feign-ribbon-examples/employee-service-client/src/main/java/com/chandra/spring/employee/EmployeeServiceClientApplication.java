package com.chandra.spring.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EmployeeServiceClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceClientApplication.class, args);
	}
}
