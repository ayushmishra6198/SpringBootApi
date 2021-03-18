package com.nagarro.training.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nagarro.training.dao.EmployeeDao;
import com.nagarro.training.entities.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeeDao.findAll();
	}

	@Override
	public Employee getEmployee(long employeeId) {
		// TODO Auto-generated method stub
		return employeeDao.findById(employeeId).get();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		System.out.println(employee.toString());
		// TODO Auto-generated method stub
		employeeDao.save(employee);
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.save(employee);
		return employee;
	}

	@Override
	public void deleteEmployee(long employeeId) {
		// TODO Auto-generated method stub
		Employee entity = employeeDao.getOne(employeeId);
		employeeDao.delete(entity);
	}
}
