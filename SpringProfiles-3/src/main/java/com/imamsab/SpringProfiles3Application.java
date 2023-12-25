package com.imamsab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.imamsab.service.profileService;

@SpringBootApplication
public class SpringProfiles3Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(SpringProfiles3Application.class, args);
		profileService bean = context.getBean(profileService.class);
		bean.saveEntity();
	
	}

}
