package com.imamsab;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class BookPK {
       private Integer bookId;
       private String bookname;
	@Override
	public String toString() {
		return "bookPK [bookId=" + bookId + ", bookname=" + bookname + "]";
	}
	
	
}
