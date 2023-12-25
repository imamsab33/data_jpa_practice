package com.imamsab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.imamsab.service.CourseService;

@SpringBootApplication
public class SbDataJpaImagesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SbDataJpaImagesApplication.class, args);
		CourseService bean = context.getBean(CourseService.class);
		//bean.insertRecordIntoDb();

		//bean.specificcol();

		bean.getAllRecords();
	}

}
