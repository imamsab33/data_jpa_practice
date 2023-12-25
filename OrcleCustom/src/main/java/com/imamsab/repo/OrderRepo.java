package com.imamsab.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imamsab.OrderEntity;

public interface OrderRepo extends JpaRepository<OrderEntity, String>{

}
