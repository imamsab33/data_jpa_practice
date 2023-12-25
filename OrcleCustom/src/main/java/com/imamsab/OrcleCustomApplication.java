package com.imamsab;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.imamsab.repo.OrderRepo;

@SpringBootApplication
public class OrcleCustomApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(OrcleCustomApplication.class, args);
        OrderRepo bean = context.getBean(OrderRepo.class);
        OrderEntity entity=new OrderEntity();
       // entity.setDate(new Date());
        entity.setOrderName("miller");
        entity.setOrderPrice("12000");
        
        OrderEntity orderEntity = bean.save(entity);
        System.out.println(orderEntity);
		context.close();
	}

}
