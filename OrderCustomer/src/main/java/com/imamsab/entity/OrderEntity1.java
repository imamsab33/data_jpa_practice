package com.imamsab.entity;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "order_entity2")
public class OrderEntity1 {
	@Id
	@GenericGenerator(name="xx" ,type = com.imamsab.pk.OrderPK.class)
	@GeneratedValue(generator = "xx")
	private String OrderId;
	private String OrderName;
    private String OrderPrice;

}
