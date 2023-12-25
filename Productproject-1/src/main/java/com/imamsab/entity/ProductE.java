package com.imamsab.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ProductE {
	 @Id
	private Long id;
	    private String name;
	    private double price;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "ProductE [id=" + id + ", name=" + name + ", price=" + price + "]";
		}
		public ProductE(Long id, String name, double price) {
			super();
			this.id = id;
			this.name = name;
			this.price = price;
		}
	    public ProductE() {
			// TODO Auto-generated constructor stub
		}
}
