package com.imamsab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
 public UserController() {
	System.out.println("the program is success ....");
}
 @GetMapping("login")
 public ModelAndView mvn() {
	 ModelAndView mvn=new ModelAndView();
      mvn.addObject("msg", "user logged succeess full");
      mvn.addObject("msg1", "your logged into ashok It page");
      mvn.setViewName("index1");
	  return mvn;
 }
}
