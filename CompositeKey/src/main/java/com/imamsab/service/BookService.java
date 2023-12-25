package com.imamsab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imamsab.BookPK;
import com.imamsab.CompositeRepo;
import com.imamsab.entity.book;

@Service
public class BookService {
	@Autowired
	private CompositeRepo compo;
//	public CompositeService(CompositeRepo compo) {
//		this.compo=compo;
//	}
	public void saveRecord() {
		BookPK pk = new BookPK(01,"java");
		book bb=new book("james","2222", pk);
		
	}

}
