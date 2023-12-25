package com.imamsab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.imamsab.entity.Book1;
import com.imamsab.service.Book1Service;

@Controller
public class Book1Controller {
	@Autowired
	private Book1Service repo1;

	@GetMapping("/index")
	public ModelAndView mvn() {
		ModelAndView mvn = new ModelAndView();
		mvn.addObject("msg2", repo1.getBook1s());
		mvn.setViewName("index");
		
		return mvn;

}
}
