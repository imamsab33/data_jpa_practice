package com.imamsab.data;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class CustomerEntity {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Integer cid;
	
	private String name;
	private String email;
	private String gender;
	
	@CreationTimestamp
	private LocalDateTime inserted;
	
	@UpdateTimestamp
	private LocalDateTime updated;

}
