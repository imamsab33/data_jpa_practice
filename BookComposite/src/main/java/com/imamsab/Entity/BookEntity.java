package com.imamsab.Entity;

import com.imamsab.BookPK;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
 public class BookEntity {
      
       private String bookPrice;
       private Long price;
       
       @EmbeddedId
       private BookPK bookpk;
//       public BookEntity() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public BookEntity(String bookPrice, Long price, BookPK bookpk) {
//		super();
//		this.bookPrice = bookPrice;
//		this.price = price;
//		this.bookpk = bookpk;
//	}
//
//	public String getBookPrice() {
//		return bookPrice;
//	}
//
//	public void setBookPrice(String bookPrice) {
//		this.bookPrice = bookPrice;
//	}
//
//	public Long getPrice() {
//		return price;
//	}
//
//	public void setPrice(Long price) {
//		this.price = price;
//	}
//
//	public BookPK getBookpk() {
//		return bookpk;
//	}
//
//	public void setBookpk(BookPK bookpk) {
//		this.bookpk = bookpk;
//	}
//         

	
       
       
}
