package com.beemesh;

import java.util.List;

import org.springframework.data.domain.Example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;

@ToString
@Data 
@Entity
public class Product {

	@Id
	private Integer id;
	private String name;
	private String brand;
	private Long price;

	
	

}
