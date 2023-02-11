package com.jsp.service;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class EmployeeService {

	EmployeeDao employeeDao=new EmployeeDao();
	
	public Employee saveEmployee(Employee employee) {
		return employeeDao.saveEmployee(employee);
	}
	
	public Employee deleteEmployee(Employee employee) {
		return employeeDao.deleteEmployee(employee);
	}
	
	public Employee updateEmployee(Employee employee) {
		return employeeDao.updateEmployee(employee);
	}
	
	public void allDetails() {
		employeeDao.allDetails();
	}
	
	
}
