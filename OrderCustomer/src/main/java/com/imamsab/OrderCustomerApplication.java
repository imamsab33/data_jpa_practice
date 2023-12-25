package com.imamsab;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.imamsab.entity.OrderEntity1;

@SpringBootApplication
public class OrderCustomerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(OrderCustomerApplication.class, args);
            OrderRepo bean = context.getBean(OrderRepo.class);
            OrderEntity1 os=new OrderEntity1();
            os.setOrderName("samusg");
            os.setOrderPrice("12000.0");
            
            
            OrderEntity1 os1=new OrderEntity1();
            os1.setOrderName("oppo");
            os1.setOrderPrice("11000.0");
            
            
            OrderEntity1 os2=new OrderEntity1();
            os2.setOrderName("realme");
            os2.setOrderPrice("13300.0");
            
            List<OrderEntity1> asList = Arrays.asList(os,os1,os2);
            bean.saveAll(asList);
            
            List<OrderEntity1> findAll = bean.findAll();
            findAll.forEach(System.out::println);
            
	}

}
