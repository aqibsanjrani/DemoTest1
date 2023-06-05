package com.example.demo.service;

import com.example.demo.models.Employeemodel;

import java.util.List;

public interface EmployeeService {
    public List<Employeemodel> getEmployees(String firstname, String lastname, String email);

}

