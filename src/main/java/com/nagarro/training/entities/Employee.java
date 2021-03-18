package com.nagarro.training.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private long EmployeeCode;

	private String firstName;
private String lastName;
	private String location;

	private String email;

	private String Dob;

	public long getEmployeeCode() {
		return EmployeeCode;
	}

	public void setEmployeeCode(long employeeCode) {
		EmployeeCode = employeeCode;
	}


	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return Dob;
	}

	public void setDob(String dob) {
		Dob = dob;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [EmployeeCode=" + EmployeeCode + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", location=" + location + ", email=" + email + ", Dob=" + Dob + "]";
	}

	
}
