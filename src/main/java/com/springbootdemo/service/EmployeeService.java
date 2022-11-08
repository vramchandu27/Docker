package com.springbootdemo.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootdemo.model.Employee;
@Repository
public interface EmployeeService extends JpaRepository<Employee,Long> {

}
