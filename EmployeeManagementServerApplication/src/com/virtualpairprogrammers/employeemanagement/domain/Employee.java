package com.virtualpairprogrammers.employeemanagement.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee implements Serializable {
	
	private static final long serialVersionUID = 300668374425845613L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String firstName;
	private String surname;
	private String jobRole;
	private int salary;
	
	public Employee() {
		//Required empty constructor for JPA
	}
	
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
