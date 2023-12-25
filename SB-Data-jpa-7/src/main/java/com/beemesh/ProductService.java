package com.beemesh;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
public class ProductService {
	@Autowired
	private ProductRepo pro;

//	public ProductService(Product pro) {
//
//		this.pro = pro;
//	}

	public void saveRecords() {
		Product pr = new Product();

		pr.setBrand("samsung");
		pr.setId(12);
		pr.setName("s22");
		pr.setPrice((long) 12000);
		Product pr1 = new Product();
		pr1.setBrand("samsung1");
		pr1.setId(12);
		pr1.setName("s221");
		pr1.setPrice((long) 120001);
		Product pr2 = new Product();
		pr2.setBrand("samsung12");
		pr2.setId(12);
		pr2.setName("s222");
		pr2.setPrice((long) 120002);
		List<Product> asList = Arrays.asList(pr, pr1, pr2);
		pro.saveAll(asList);
	}

	public void queryByExample() {
		Product pr4 = new Product();

		pr4.setBrand("Samsung");
		Example<Product> of = Example.of(pr4);
		List<Product> findAll = pro.findAll(of);

	findAll.forEach(System.out::println);
	}
}
