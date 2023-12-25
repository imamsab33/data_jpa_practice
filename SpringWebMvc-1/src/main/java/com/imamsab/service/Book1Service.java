package com.imamsab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imamsab.entity.Book1;
import com.imamsab.repo.Book1Repo;

@Service

public class Book1Service implements Book1Service1 {
	@Autowired
	private Book1Repo repo;

	@Override
	public List<Book1> getBook1s() {
		
		return repo.findAll();
	}

@Override
public boolean saveBook(Book1 book) {
                Book1 save = repo.save(book);
                if(save.getBid()!=null){
                	return true;
                }
	return false;
}


	
	
	

	
}
