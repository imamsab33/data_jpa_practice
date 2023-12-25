package com.imamsab.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imamsab.Entity.EntityClass;

public interface BookRepository extends JpaRepository<EntityClass, Integer>{

}
