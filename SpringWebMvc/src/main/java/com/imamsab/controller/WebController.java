package com.imamsab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {
      public WebController() {
	System.out.println("the program is running successfully....");
    }
      @GetMapping("/welcome")
    public ModelAndView mvn()
    {
    	  ModelAndView mvn=new ModelAndView();
   mvn.addObject("add","welcome to ashok it");
   mvn.addObject("add1", "the best software training center");
   mvn.setViewName("index");
		return mvn;
    	
    }
}
