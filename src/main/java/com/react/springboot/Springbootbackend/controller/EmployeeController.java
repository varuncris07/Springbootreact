package com.react.springboot.Springbootbackend.controller;

import com.react.springboot.Springbootbackend.model.Employee;
import com.react.springboot.Springbootbackend.repositry.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository; // no change

    public List<Employee> getAllEmployees()
    {
        return employeeRepository.findAll();
    }
}
