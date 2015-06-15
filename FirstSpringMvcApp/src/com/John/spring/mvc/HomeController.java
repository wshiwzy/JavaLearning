package com.John.spring.mvc;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.John.spring.model.Employee;
import com.John.spring.service.EmployeeService;

@Controller
@RequestMapping("/home")
public class HomeController {
	@Autowired
	EmployeeService employeeService;

	@RequestMapping("/index")
	public ModelAndView Index() {

		Employee employee = employeeService.findEmployeeById((long) 1);

		ModelAndView mav = new ModelAndView("Index");
		mav.addObject("employeeName", employee.getName());
		mav.addObject("age", employee.getAge());
		mav.addObject("isenable", employee.isEnable());
		mav.addObject("address", employee.getAddress());
		mav.addObject("tel", employee.getTel());
		return mav;
	}
}
