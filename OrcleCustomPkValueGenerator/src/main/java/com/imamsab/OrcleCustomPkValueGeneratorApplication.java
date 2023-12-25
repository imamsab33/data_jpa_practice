package com.imamsab;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.imamsab.entity.Course;
import com.imamsab.repo.CourseRepo;

@SpringBootApplication
public class OrcleCustomPkValueGeneratorApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(OrcleCustomPkValueGeneratorApplication.class,
				args);

		CourseRepo bean = context.getBean(CourseRepo.class);

		Course ob = new Course();
		ob.setCname("sql");
		ob.setFee(8000.00);
		Course ob1 = new Course();
		ob1.setCname("python");
		ob1.setFee(1500.00);

		List<Course> asList = Arrays.asList(ob, ob1);
		bean.saveAll(asList);
		
		
		List<Course> findAll = bean.findAll();
		findAll.forEach(System.out::println);
		

	}

}
