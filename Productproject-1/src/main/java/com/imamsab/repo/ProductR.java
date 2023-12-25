package com.imamsab.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imamsab.entity.ProductE;

public interface ProductR extends JpaRepository<ProductE, Long> {

}
