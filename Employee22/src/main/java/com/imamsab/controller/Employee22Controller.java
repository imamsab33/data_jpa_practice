package com.imamsab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.imamsab.entity.Employee22;
import com.imamsab.service.Employee22Service;

@Controller
public class Employee22Controller {
	@Autowired
	private Employee22Service service;
	
	@GetMapping("/find")
	public ModelAndView mvn2(){
		ModelAndView mvn=new ModelAndView();
		mvn.addObject("employee",new Employee22());
		mvn.setViewName("find");
		return mvn;
	}
	@PostMapping("/saved")
	public ModelAndView mvn1(Employee22 employee) {
		ModelAndView mvn =new ModelAndView();
		boolean b = service.saveEmployee23(employee);
		if(b) {
			mvn.addObject("succes", "success fully entered");
		}
		else {
			mvn.addObject("error","message was failed to  send ");
		}
		return mvn;
	}
	   @GetMapping("/index")
         public ModelAndView mvn() {
        	 ModelAndView mvn1=new ModelAndView();
        	               List<Employee22> list = service.getAllEmployee22s();
        	               mvn1.addObject("msg",list);
        	               mvn1.setViewName("index");
        	                return mvn1;
         }
}
