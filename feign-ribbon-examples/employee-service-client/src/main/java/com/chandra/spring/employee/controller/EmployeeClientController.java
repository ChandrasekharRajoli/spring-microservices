package com.chandra.spring.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chandra.spring.employee.clients.EmployeeServiceClient;
import com.chandra.spring.employee.model.Employee;

@RestController
public class EmployeeClientController {

    @Autowired
    EmployeeServiceClient employeeServiceClient;
    

    @RequestMapping(path="/client/{empId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    private ResponseEntity<Employee> findByEmpId(@PathVariable(name="empId") String empId) {
        return employeeServiceClient.findEmployeeById(empId);
    }
}
