package com.imamsab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imamsab.entity.BookStore;
import com.imamsab.repository.BookStoreRepo;

@Service
public class BookStoreService {
              
	@Autowired
	private BookStoreRepo repo;
	
	public void save(BookStore b) {
		repo.save(b);
	}
    public List<BookStore> getAllBookStores(){
		return repo.findAll();
    	
    }
	
}
