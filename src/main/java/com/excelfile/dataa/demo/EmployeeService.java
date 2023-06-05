package com.excelfile.dataa.demo;


import java.util.List;

public interface EmployeeService {
    public List<Employeemodel> getEmployees(String firstname, String lastname, String email);

}

