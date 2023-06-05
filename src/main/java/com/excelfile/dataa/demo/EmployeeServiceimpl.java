package com.excelfile.dataa.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceimpl implements EmployeeService {
    @Autowired
    private UserRepository userRepository;

    public List<Employeemodel> getEmployees(String firstname, String lastname, String email) {

        UserEntity user = new UserEntity();
        user.setFirstName(firstname);
        user.setLastName(lastname);
        user.setEmail(email);
        userRepository.save(user);

        return null;
    }

}