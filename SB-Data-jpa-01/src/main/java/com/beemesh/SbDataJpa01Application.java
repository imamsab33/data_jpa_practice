package com.beemesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SbDataJpa01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SbDataJpa01Application.class, args);
		                EmployeeService service = context.getBean(EmployeeService.class);
		                  service.SaveEmp();
	}

}
