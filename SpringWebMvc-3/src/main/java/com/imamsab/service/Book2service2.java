package com.imamsab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imamsab.entity.book2;
import com.imamsab.repo.Book2Repo;
@Service
public class Book2service2 {
	@Autowired
	private Book2Repo bookRepo;

	public List<book2> getAllBooks() {
		return bookRepo.findAll();
	}

	public boolean saveBook2(book2 book) {
		book2 savedBook = bookRepo.save(book);
		if (savedBook.getBookId() != null) {
			return true;
		}
		return false;
	}

}
