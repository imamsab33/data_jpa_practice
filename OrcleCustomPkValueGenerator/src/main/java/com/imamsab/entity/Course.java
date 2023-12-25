package com.imamsab.entity;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Course {

	@Id
	@GenericGenerator(name = "xx", type = com.imamsab.entity.CustomPkValueGenerator.class)
	@GeneratedValue(generator = "xx")
	private String cid;
	private String cname;
	private Double fee;

}
