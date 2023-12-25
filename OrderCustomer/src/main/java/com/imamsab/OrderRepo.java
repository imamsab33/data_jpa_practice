package com.imamsab;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;


import com.imamsab.entity.OrderEntity1;

public interface OrderRepo extends JpaRepository<OrderEntity1, Serializable> {

}
