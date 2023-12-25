package com.imamsab.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class book2 {

	

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer bookId; // book_id
		private String bookName;
		private Double bookPrice;
		public Integer getBookId() {
			return bookId;
		}
		public void setBookId(Integer bookId) {
			this.bookId = bookId;
		}
		public String getBookName() {
			return bookName;
		}
		public void setBookName(String bookName) {
			this.bookName = bookName;
		}
		public Double getBookPrice() {
			return bookPrice;
		}
		public void setBookPrice(Double bookPrice) {
			this.bookPrice = bookPrice;
		}
		@Override
		public String toString() {
			return "book2 [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
		}
		public book2(Integer bookId, String bookName, Double bookPrice) {
			super();
			this.bookId = bookId;
			this.bookName = bookName;
			this.bookPrice = bookPrice;
		}
public book2() {
	// TODO Auto-generated constructor stub
}
		//setters & getters

	}

