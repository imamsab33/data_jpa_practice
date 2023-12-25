package com.beemesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.beemesh.service.SvService;

@SpringBootApplication
public class SbDataJpa4Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run=SpringApplication.run(SbDataJpa4Application.class, args);
		SvService sv=run.getBean(SvService.class);
		sv.saveService1();
	}

}
