package com.imamsab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;

import com.imamsab.Service.BookService;

@SpringBootApplication
public class BookCompositeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(BookCompositeApplication.class, args);
		BookService service = context.getBean(BookService.class);
		service.saveRecords();
		//service.getRecords();
	}

}
