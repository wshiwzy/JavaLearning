package com.John.spring.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.John.spring.model.Employee;
import com.John.spring.service.EmployeeService;

@Controller
@RequestMapping("/Employee")
public class EmployeeController {

	private final EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public ModelAndView addEmployee(Employee emp) {
		ModelAndView mav = new ModelAndView();
		employeeService.addEmployee(emp);
		return mav;
	}
	
	

}