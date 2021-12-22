package com.practice.homedepot.controller;

import com.practice.homedepot.Service.EmployeeService;
import com.practice.homedepot.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }
    @GetMapping("/{id}/{name}")
    public Employee getEmployeeByIdAndName(@PathVariable long id, @PathVariable String name) {
        return employeeService.getEmployeeByIdAndName(id, name);
    }
}
