package com.beemesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SbDataJpa7Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SbDataJpa7Application.class, args);
	ProductService bean = context.getBean(ProductService.class);
	bean.saveRecords();
	}

}
