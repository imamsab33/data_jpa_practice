package com.imamsab.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Book1 {
	@Id
	private Integer bid;
	private String bname;
	private String author;
	private Long price;

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book1 [bid=" + bid + ", bname=" + bname + ", author=" + author + ", price=" + price + "]";
	}

	public Book1(Integer bid, String bname, String author, Long price) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.author = author;
		this.price = price;
	}

public Book1() {
	
}}
