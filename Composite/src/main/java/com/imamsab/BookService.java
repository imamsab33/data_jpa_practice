package com.imamsab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class BookService {
	
	@Autowired
	
	private BookRepo repo;
	
	public void saveBook() {
		BookPk en1 =new BookPk(01, "java");
		Book en=new Book(78.00, "james",en1);
				
//		en.setAuthorName("james");
//		en.setBookPrice(78.00);
		repo.save(en);
		System.out.println("Record saved..");
	}

}