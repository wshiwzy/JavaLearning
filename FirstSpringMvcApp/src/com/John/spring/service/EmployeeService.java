package com.John.spring.service;

import java.util.List;

import com.John.spring.model.Employee;

public interface EmployeeService {
	
	Employee findEmployeeById(long empId);
	
	void addEmployee(Employee emp);
	
	void deleteEmployee(long empId);
	
	void updateEmployee(Employee emp);
		
	List<Employee> getAllEmployees();
}