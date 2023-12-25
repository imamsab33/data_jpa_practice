package com.imamsab;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "contact_us_leads")
public class ContactusEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cid;
	private String cname;
	private String cmail;
	private Integer cphno;
    @CreationTimestamp
    
    private LocalDateTime current_time;
    @UpdateTimestamp
    private UpdateTimestamp udpade_time;
    
    
}
