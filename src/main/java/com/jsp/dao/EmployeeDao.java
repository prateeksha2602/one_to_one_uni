package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Employee;

public class EmployeeDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("prateeksha");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public Employee saveEmployee(Employee employee) {
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		
		System.out.println("All good");
		
		return employee;
	}
	
	public Employee deleteEmployee(Employee employee) {
		Employee del=entityManager.find(Employee.class, employee.getId());
		
		entityTransaction.begin();
		entityManager.remove(del);
		entityTransaction.commit();
		
		System.out.println("Object deleted");
		
		return employee;
		
	}
	
	public Employee updateEmployee(Employee employee) {
		Employee update=entityManager.find(Employee.class, employee.getId());
		
		if(update!=null) {
			update.setName(update.getName());
			entityTransaction.begin();
			entityManager.merge(update);	
			entityTransaction.commit();
			
			System.out.println("Object updated");
			
		}
		else
			System.out.println("Employee not found");
		
		return employee;
		
	}
	
	public void allDetails() {
		String sql="SELECT e FROM Employee e";
		Query query=entityManager.createQuery(sql);
		
		List<Employee> l1=query.getResultList();
		
		for(Employee e:l1) {
			System.out.println(e.getId());
			System.out.println(e.getName());
			System.out.println(e.getEmail());
			System.out.println(e.getSal());
			
		}
	}
	
}
