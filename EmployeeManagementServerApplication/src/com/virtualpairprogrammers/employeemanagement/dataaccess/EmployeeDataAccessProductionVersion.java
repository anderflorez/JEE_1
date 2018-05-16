package com.virtualpairprogrammers.employeemanagement.dataaccess;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.virtualpairprogrammers.employeemanagement.domain.Employee;

@Stateless
@Default
@ProductionDao
public class EmployeeDataAccessProductionVersion implements EmployeeDataAccess {
	
	// By making the entity manager an attribute of the class with this annotation the application server, 
	// which is wildfly in this case, will have access to it and will automatically create and handle the 
	// entity manager and the transaction.
	@PersistenceContext
	private EntityManager em;

	@Override
	public void insert(Employee newEmployee) {
		
		em.persist(newEmployee);
	}

	@Override
	public List<Employee> findAll() {
		
		Query q = em.createQuery("select employee from Employee employee");
		List<Employee> employees = q.getResultList();
		return employees;
	}

	@Override
	public List<Employee> findBySurname(String surname) {
		
		Query q = em.createQuery("select employee from Employee employee where employee.surname = :surname");
		q.setParameter("surname", surname);
		List<Employee> employees = q.getResultList();
		return employees;
	}

}
