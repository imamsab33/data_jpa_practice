package com.imamsab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.imamsab.data.CustomerService;

@SpringBootApplication
public class UpdateAndCreateApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = 
				SpringApplication.run(UpdateAndCreateApplication.class, args);
		CustomerService bean = run.getBean(CustomerService.class);
		bean.saveRecord();
	}

}
