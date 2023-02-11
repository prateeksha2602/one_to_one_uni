package com.jsp.controller;

import com.jsp.dto.Employee;
import com.jsp.service.EmployeeService;

public class Controller {
public static void main(String[] args) {
	Employee employee=new Employee();
	employee.setId(1);
	employee.setName("Adam");
	employee.setEmail("adam@mail.com");
	employee.setSal(4000);
	
	//INSERT
	EmployeeService employeeService=new EmployeeService();
	employeeService.saveEmployee(employee);
	
	//DELETE
	Employee deleteEmployee=new Employee();
	deleteEmployee.setId(1);
	//employeeService.deleteEmployee(deleteEmployee);
	
	//UPDATE
	Employee updateEmployee=new Employee();
	updateEmployee.setId(2);
	updateEmployee.setName("King");
	//employeeService.updateEmployee(updateEmployee);
	
	//ALL DETAILS
	//employeeService.allDetails();
	
}
}
