package com.imamsab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.imamsab.service.ImageService;

@SpringBootApplication
public class SbDataJpaImages1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SbDataJpaImages1Application.class, args);
		ImageService bean = context.getBean(ImageService.class);
		bean.saveImage1();
	}

}
