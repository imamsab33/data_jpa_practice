package com.imamsab;

import java.sql.Date;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class OrderEntity {
   @Id
   @Column(name = "Order_Id")
   @GenericGenerator(
		   name="Order_Id_gen",
		   type  = com.imamsab.generator.OrderIdGenerator.class)
     @GeneratedValue(generator = "Oder_Id_gen")
	private String orderId;
 //  @Column(name="Order_name")
	private String orderName;
  // @Column(name="Order_price")
	private String orderPrice;
   @Column(name="date")
   
    @UpdateTimestamp
	private Date date;
}
