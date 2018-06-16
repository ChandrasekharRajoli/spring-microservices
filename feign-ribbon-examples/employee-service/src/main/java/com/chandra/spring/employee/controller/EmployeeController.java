package com.chandra.spring.employee.controller;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.chandra.spring.employee.model.Employee;

@RestController
public class EmployeeController {

    @Autowired
    Environment environment;

    
    @GetMapping(path="/employees/{empId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    private @ResponseBody Employee findByEmpId(@PathVariable(name="empId") String empId) {
        System.out.println("Time --> "+Instant.now().toString()+ " --Server Port : "+environment.getProperty("local.server.port"));
        return Employee.valueOf("1", "Chandrasekhar", "Technology");
    }
}
