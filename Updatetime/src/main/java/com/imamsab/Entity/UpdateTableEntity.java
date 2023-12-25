package com.imamsab.Entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class UpdateTableEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sno;
	private String sname;
	private String email;
    
	@CreationTimestamp
	@Column(name="created_time",updatable = false)
	private LocalDateTime insertion_time;
	@Column(name="updated_time",insertable = false)
	@CreationTimestamp
	private LocalDateTime update_time;
}
