package com.imamsab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.imamsab.repo.ContactUsRepo;

@SpringBootApplication
public class SbDataJpa8Application {
	
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SbDataJpa8Application.class, args);
		ContactUsRepo bean = context.getBean(ContactUsRepo.class);
		ContactusEntity ce=new ContactusEntity();

	    ce.setCname("himamsab");
	    ce.setCmail("himamsab@hotmail.com");
	    ce.setCphno(7984842);
	    
	   bean.save(ce);
	}

}
