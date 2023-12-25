package com.imamsab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.imamsab.service.ExcelService;

@SpringBootApplication
public class ExcelReportApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ExcelReportApplication.class, args);
		
		ExcelService bean = context.getBean(ExcelService.class);
		
		bean.generatedExcel();
	}

}
