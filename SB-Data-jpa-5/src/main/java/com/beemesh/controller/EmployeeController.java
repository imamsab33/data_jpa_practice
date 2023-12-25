package com.beemesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	public EmployeeController() {
		// TODO Auto-generated constructor stub
	}
	@GetMapping("web")
	public ModelAndView mvn() {
		ModelAndView mvn=new ModelAndView();
		mvn.addObject("add", "connexting data jpa and web starter");
		mvn.addObject("add1","thank you");
		mvn.setViewName("index");
		return mvn;
		
	}
}
