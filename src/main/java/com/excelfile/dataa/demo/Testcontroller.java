package com.excelfile.dataa.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/user")
public class Testcontroller {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping(path = "/add")
    public @ResponseBody
    String addNewUser(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String email) {

        employeeService.getEmployees(firstName, lastName, email);

        return "User Created";
    }


}



