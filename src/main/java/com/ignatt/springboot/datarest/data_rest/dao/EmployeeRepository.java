package com.ignatt.springboot.datarest.data_rest.dao;


import com.ignatt.springboot.datarest.data_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
