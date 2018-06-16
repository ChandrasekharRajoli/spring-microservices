package com.chandra.spring.employee.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chandra.spring.employee.model.Employee;

@FeignClient(name="employees")
public interface EmployeeServiceClient {

    @RequestMapping(method = RequestMethod.GET, value = "/employee-service/employees/{empId}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Employee> findEmployeeById(@PathVariable("empId") String empId);
}
