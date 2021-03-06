package com.virtualpairprogrammers.employeemanagement.dataaccess;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Alternative;

import com.virtualpairprogrammers.employeemanagement.domain.Employee;

@Alternative
@TestingDao
public class EmployeeDataAccessTestingVersion implements EmployeeDataAccess {

	@Override
	public void insert(Employee newEmployee) {
		

	}

	@Override
	public List<Employee> findAll() {
		
		Employee e1 = new Employee("James", "Green", "Writer", 1700);
		Employee e2 = new Employee("Sharon", "White", "Editor", 2100);
		Employee e3 = new Employee("Darren", "Blue", "Manager", 31250);
		List<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		return employees;
	}

	@Override
	public List<Employee> findBySurname(String surename) {
		
		return null;
	}

}
