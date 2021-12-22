package com.practice.homedepot.Service;

import com.practice.homedepot.model.Employee;
import com.practice.homedepot.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;
    public List<Employee> getAllEmployees(){
        return employeeRepo.findAll();
    }
    public Employee saveEmployee(Employee employee) {
        employeeRepo.save(employee);
        return employee;
    }

    public Employee getEmployeeByIdAndName(long id, String name) {
        return employeeRepo.getEmployeeByIdAndName(id, name);
    }
}
