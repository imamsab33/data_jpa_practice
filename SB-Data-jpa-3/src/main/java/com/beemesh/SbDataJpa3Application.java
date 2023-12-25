
package com.beemesh;

import org.springframework.boot.SpringApplication;
//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.beemesh.io.io.ILRG;
import com.beemesh.io.io.service.LRGService;

@SpringBootApplication
public class SbDataJpa3Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run=SpringApplication.run(SbDataJpa3Application.class, args);
		
		LRGService bean=run.getBean(LRGService.class);
//		
       bean.saveService();
		//bean.getAllLRG("himam22");
		  // bean.getfindBysnoAndName(78,"himam22");
		//bean.getAllEmpRecord();
	}

}