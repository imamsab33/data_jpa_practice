package com.imamsab.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imamsab.BookPK;
import com.imamsab.Entity.BookEntity;
import com.imamsab.Repo.BookRepo;

@Service
public class BookService {
	    @Autowired
        private BookRepo repo;
	    public void saveRecords() {
	    	BookPK bk=new BookPK(101, "java");
//	    	  bk.setBookId(101);
//	    	  bk.setBookName("java");
	    	BookEntity be=new BookEntity("thousand", 1000l, bk);
	    	
	    	
	    /*	BookPK bk1=new BookPK();
	    	  bk1.setBookId(102);
	    	  bk1.setBookName("python");
	    	BookEntity be1=new BookEntity("thousand", 1000l, bk1);
	    	
	    	BookPK bk2=new BookPK();
	    	  bk2.setBookId(103);
	    	  bk2.setBookName("oracle");
	    	BookEntity be2=new BookEntity("thousand", 1000l, bk2);
	    	
	    	List<BookEntity> asList = Arrays.asList(be,be1,be2);
	    	repo.saveAll(asList);*/
	    	repo.save(be);
	    	System.out.println("save record.......");}
//	    	public void getRecords() {
//	    		BookPK be =new BookPK(102,"python");
//	    		Optional<BookEntity> findById = repo.findById(be);
//	    		if(findById.isPresent()) {
//	    			System.out.println(findById.get());
//	    	}
//	    }
		
}
