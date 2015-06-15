package com.John.spring.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.John.spring.dao.EmployeeDao;
import com.John.spring.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDao employeeDao;

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public Employee findEmployeeById(long empId) {
		return employeeDao.findEmployeeById(empId);
	}

	@Override
	public void addEmployee(Employee emp) {
		employeeDao.addEmployee(emp);

	}

	@Override
	public void deleteEmployee(long empId) {
		employeeDao.deleteEmployee(empId);

	}

	@Override
	public void updateEmployee(Employee emp) {
		employeeDao.updateEmployee(emp);

	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();
	}

}