//package com.imamsab.data;
//
//import java.util.Arrays;
//import java.util.List;
//
//import org.springframework.stereotype.Service;
//
//@Service
//public class CustomerService {
//	
//	
//	private CustomerRepository repos;
//	
//	
//
//	public CustomerService(CustomerRepository repos) {
//		
//		this.repos = repos;
//	}
//
//
//	public void saveRecord() {
//		CustomerEntity cs = new CustomerEntity();
//		cs.setName("himam");
//		cs.setEmail("himam@gmail.com");
//		cs.setGender("male");
//
//		CustomerEntity cs2 = new CustomerEntity();
//		cs2.setName("divya");
//		cs2.setEmail("divya@gmail.com");
//		cs2.setGender("female");
//
//		CustomerEntity cs1 = new CustomerEntity();
//		cs1.setName("bheemesh");
//		cs1.setEmail("bheemesh@gmail.com");
//		cs1.setGender("male");
//
//		CustomerEntity cs3 = new CustomerEntity();
//		cs3.setName("pooja");
//		cs3.setEmail("pooja@gmail.com");
//		cs3.setGender("female");
//
//		CustomerEntity cs4 = new CustomerEntity();
//		cs4.setName("uday");
//		cs4.setEmail("uday@gmail.com");
//		cs4.setGender("male");
//
//		List<CustomerEntity> list = Arrays.asList(cs, cs1, cs2, cs3, cs4);
//		repos.saveAll(list);

	}
}
