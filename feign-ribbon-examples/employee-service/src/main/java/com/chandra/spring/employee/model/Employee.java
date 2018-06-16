package com.chandra.spring.employee.model;

public class Employee {

    private String empId;
    
    private String empName;
    
    private String depName;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public Employee(String empId, String empName, String depName) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.depName = depName;
    }
    
    public static Employee valueOf(String empId, String empName, String depName) {
        return new Employee(empId, empName, depName);
    }
}
