package com.imamsab.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.imamsab.entity.Employee13;
import com.imamsab.service.EmployeeService;

@Controller // Add this annotation
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @GetMapping("/showdata")
    public ModelAndView mvn() {
        // Add model attributes if needed
        ModelAndView mvn = new ModelAndView();
        mvn.addObject("entity", new Employee13());
        return mvn;
    }

    @PostMapping("/saveEntity")
    public String saveEntity(@ModelAttribute("entity") Employee13 entity) {
        service.saveRecords(entity);
        return "redirect:/success"; // Redirect to a success page
    }
}
