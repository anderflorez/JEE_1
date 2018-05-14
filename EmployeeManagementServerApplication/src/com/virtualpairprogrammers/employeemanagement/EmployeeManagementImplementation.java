package com.virtualpairprogrammers.employeemanagement;

import java.util.ArrayList;
import java.util.List;

import com.virtualpairprogrammers.employeemanagement.domain.Employee;

public class EmployeeManagementImplementation implements EmployeeManagementService {

	@Override
	public void registerEmployee(Employee employee) {

	}

	@Override
	public List<Employee> getAllEmployees() {
		
		Employee e1 = new Employee("James", "Green", "Writer", 1700);
		Employee e2 = new Employee("Sharon", "White", "Editor", 2100);
		List<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		return employees;
	}

	@Override
	public List<Employee> searchBySurname() {
		
		return null;
	}

}
