package com.imamsab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.imamsab.Entity.EntityClass;
import com.imamsab.repo.BookRepository;

@SpringBootApplication
public class H2DatabaseApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(H2DatabaseApplication.class, args);
		BookRepository bean = context.getBean(BookRepository.class);
		EntityClass es= EntityClass.builder()
				.cid(1)
				.bookName("java")
				.author("james")
				.build();
		
		EntityClass save = bean.save(es);
		System.out.println(save);
	}

}
