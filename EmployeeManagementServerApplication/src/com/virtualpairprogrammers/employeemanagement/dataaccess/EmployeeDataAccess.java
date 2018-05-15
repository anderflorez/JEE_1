package com.virtualpairprogrammers.employeemanagement.dataaccess;

import java.util.List;

import javax.ejb.Local;

import com.virtualpairprogrammers.employeemanagement.domain.Employee;

@Local
public interface EmployeeDataAccess {
	
	public void insert(Employee newEmployee);
	public List<Employee> findAll();
	public List<Employee> findBySurename(String surename);

}
