package com.virtualpairprogrammers.employeemanagement.domain;


import java.io.Serializable;

public class Employee implements Serializable {
	
	private String firstName;
	private String surname;
	private String jobRole;
	private int salary;
	
	public Employee(String firstName, String surname, String jobRole, int salary) {
		super();
		this.firstName = firstName;
		this.surname = surname;
		this.jobRole = jobRole;
		this.salary = salary;
	}
	
	public String toString() {
		
		return "Employee: " + this.firstName + " " + this.surname;
	}

}
