package com.nagarro.training.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.training.entities.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Long> {

}
