package com.beemesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.beemesh.entity.Employee;
import com.beemesh.service.EmployeeService;

@SpringBootApplication
public class SbDataJpa5Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run=SpringApplication.run(SbDataJpa5Application.class, args);
		
		EmployeeService bean=run.getBean(EmployeeService.class);
		bean.saveService();
		
	}

}
