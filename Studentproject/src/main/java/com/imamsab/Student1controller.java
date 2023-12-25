package com.imamsab;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.imamsab.entity.Student1;
import com.imamsab.service.Student1Service;

@Controller
public class Student1controller {

    @Autowired
    private Student1Service service;

    @GetMapping("/logon")
    public String viewHomePage(Model model) {
        List<Student1> liststudent = service.listAll();
        model.addAttribute("liststudent", liststudent);
       
        return "index";
    }

    @GetMapping("/new")
    public ModelAndView mvn() {
        ModelAndView mvn = new ModelAndView("new");
        mvn.addObject("student", new Student1());
        return mvn;
    }

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute("student") Student1 std) {
        service.save(std);
        return "redirect:/logon";
    }

    @PatchMapping("/edit/{id}")
    public ModelAndView showEditStudentPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("new");
        Student1 std = service.get(id);
        mav.addObject("student", std);
        return mav;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "redirect:/logon";
    }
}


