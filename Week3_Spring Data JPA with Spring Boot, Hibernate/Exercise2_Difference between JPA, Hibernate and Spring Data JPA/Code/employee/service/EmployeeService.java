package com.cognizant.employee.service;


import com.cognizant.employee.model.Employee;
import com.cognizant.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }
}
