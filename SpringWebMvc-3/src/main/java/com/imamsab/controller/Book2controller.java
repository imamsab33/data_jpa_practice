package com.imamsab.controller;

import java.awt.print.Book;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.imamsab.entity.book2;
import com.imamsab.service.Book2service;
@Controller
public class Book2controller {

	@Autowired
	private Book2service service;

	@GetMapping("/index")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();

		// sending empty obj for form binding
		mav.addObject("book", new book2());

		mav.setViewName("index");

		return mav;
	}

	@PostMapping("/book")
	public ModelAndView saveBook(book2 book) {

		ModelAndView mav = new ModelAndView();

		boolean status = service.saveBook(book);
		if (status) {
			mav.addObject("succMsg", "Book Saved");
		} else {
			mav.addObject("errMsg", " Failed to save");
		}

		mav.setViewName("index");

		return mav;
	}

	@GetMapping("/books")
	public ModelAndView getBooks() {
		ModelAndView mav = new ModelAndView();
                    java.util.List<Book> getAllBook2Books = service.getAllBook2Books;
		mav.addObject("books", getAllBook2Books);
		mav.setViewName("booksView");
		return mav;
	}
}
