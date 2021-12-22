package com.practice.homedepot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Data
public class Employee {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private double salary;

//    public static void main(String[] args) {
//        Employee employee = Employee.builder().name("Betty").build();
//        employee.setId(1);
//        employee.setSalary(12000);
//        System.out.println(employee.toString());
//    }
}
