package com.beemesh;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.beemesh.dao.MobileDao;
import com.beemesh.repo.MobileRepo;
import com.beemesh.service.MobileService;

@SpringBootApplication
public class SbDataJpa6Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SbDataJpa6Application.class, args);
		ProductService bean = context.getBean(ProductService.class);
		bean.saveRecords();

		// findAll.forEach(System.out::println);

		System.out.println("\n===============================================================\n");

//		List<MobileDao> findByMake = repo.findByMakeAndMname("mi", "mi-11x");
//		findByMake.forEach(System.out::println);

		// bean.queryByexample();

		// bean.saverecords();
	}

}
