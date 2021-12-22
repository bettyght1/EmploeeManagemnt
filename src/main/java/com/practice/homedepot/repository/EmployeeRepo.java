package com.practice.homedepot.repository;

import com.practice.homedepot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    @Query("select e from Employee e where e.id = :id and e.name = :name")
    Employee getEmployeeByIdAndName(long id, String name);
}
