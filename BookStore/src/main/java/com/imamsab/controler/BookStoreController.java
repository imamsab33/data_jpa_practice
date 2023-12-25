package com.imamsab.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.imamsab.entity.BookStore;
import com.imamsab.service.BookStoreService;

import jakarta.persistence.GeneratedValue;

@Controller
public class BookStoreController {
	@Autowired
	private  BookStoreService service;
	
                 @GetMapping("/")
                 public String home() {
                	 return "home"; 
                 }
                 @GetMapping("/BookRegister")
                 public String bookRegister() {
                	 return "bookRegister";
                 }
                 @GetMapping("Available_books")
                 public ModelAndView getAllBook()
                 {
                	 List<BookStore> list = service.getAllBookStores();
                ModelAndView mvn=new  ModelAndView();
                mvn.setViewName("bookList");
                mvn.addObject("book",list);
                  return mvn;
                 }
                 @PostMapping("/save")
                 public String addBook(@ModelAttribute BookStore b) {
                	 service.save(b);
                	 return "redirect:/Available_books";
                 }
                 @GetMapping("/mybooks")
                 
                	 public String mybooks() {
                	 
                		 return "mybooks.html";
                	 }
                 }
                 
}
