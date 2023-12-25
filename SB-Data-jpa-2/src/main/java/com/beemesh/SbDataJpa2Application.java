package com.beemesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.beemesh.io1.IStudent;
import com.beemesh.service.StudentService;

@SpringBootApplication
public class SbDataJpa2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SbDataJpa2Application.class, args);
		    //StudentService bean = run.getBean(StudentService.class);

		    
	}

}
