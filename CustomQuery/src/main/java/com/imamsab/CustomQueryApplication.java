package com.imamsab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.imamsab.Entity.CustomQuery;
import com.imamsab.repo.CustomRepo;

@SpringBootApplication
public class CustomQueryApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(CustomQueryApplication.class, args);
//		CustomRepo bean = context.getBean(CustomRepo.class);
//		CustomQuery sc=new CustomQuery();
//		sc.setFistName("oracle");
//		sc.setSecondName("jhahson");
//		bean.save(sc);
	}

}
