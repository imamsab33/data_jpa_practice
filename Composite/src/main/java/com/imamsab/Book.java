package com.imamsab;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table
public class Book {
	

	
	private Double bookPrice;
	private String authorName;
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(Double bookPrice, String authorName, BookPk bookPk) {
		super();
		this.bookPrice = bookPrice;
		this.authorName = authorName;
		this.bookPk = bookPk;
	}
	public Double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public BookPk getBookPk() {
		return bookPk;
	}
	public void setBookPk(BookPk bookPk) {
		this.bookPk = bookPk;
	}
	@EmbeddedId
	private BookPk bookPk;
	
	

}