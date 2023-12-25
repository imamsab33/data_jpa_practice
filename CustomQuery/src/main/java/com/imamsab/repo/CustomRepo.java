package com.imamsab.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.imamsab.Entity.CustomQuery;

public  interface CustomRepo extends JpaRepository<CustomQuery, Integer> {
	@Query("INSERT INTO person(firstName, lastName) VALUES (:firstName, :lastName)")
	abstract
    void insertPerson(@Param("firstName") String firstName, @Param("lastName") String lastName);
}
