package com.John.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/home")
public class HomeController {
	
	@RequestMapping("/index")
	public ModelAndView Index()
	{
		ModelAndView mav=new ModelAndView("Index");
		mav.addObject("employeeName", "zywu");
		mav.addObject("age", 10);
		return mav;
	}
	
}