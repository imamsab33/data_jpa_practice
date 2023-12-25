package com.imamsab;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookPK {
	
        private Integer bookId;
        private String bookName;
        
//        public BookPK() {
//			// TODO Auto-generated constructor stub
//		}
//		public BookPK(Integer bookId, String bookName) {
//			super();
//			this.bookId = bookId;
//			this.bookName = bookName;
//		}
//		public Integer getBookId() {
//			return bookId;
//		}
//		public void setBookId(Integer bookId) {
//			this.bookId = bookId;
//		}
//		public String getBookName() {
//			return bookName;
//		}
//		public void setBookName(String bookName) {
//			this.bookName = bookName;
//		}
//		
        
        
}
