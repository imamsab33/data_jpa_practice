package com.imamsab.entity;


import com.imamsab.BookPK;


import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "book_details")
@Data
public class book {
	       @Id
           private String author;
           private String price;
           @EmbeddedId
           private BookPK compo;
		@Override
		public String toString() {
			return "CompostiteEntity [author=" + author + ", price=" + price + "]";
		}
           
}
