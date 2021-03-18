package com.nagarro.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.nagarro.training.entities.Employee;
import com.nagarro.training.services.EmployeeService;

@RestController
public class MainController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/")
	public String home() {

		return "Welcome to Employee Application";
	}

	// get the employee
	@GetMapping("/employee")
	public List<Employee> getEmployees() {
		return this.employeeService.getEmployees();
	}

	// get the employee from employee id
	@GetMapping("/employee/{employeeId}")
	public Employee getEmployee(@PathVariable String employeeId) {
		return this.employeeService.getEmployee(Long.parseLong(employeeId));
	}

	// add the new Employee
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		System.out.println(employee.toString());
		return this.employeeService.addEmployee(employee);
	}

	// update the Employee
	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return this.employeeService.updateEmployee(employee);
	}

	// delete the Employee
	@DeleteMapping("/employee/{employeeId}")
	public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable String employeeId) {
		try {
			this.employeeService.deleteEmployee(Long.parseLong(employeeId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
