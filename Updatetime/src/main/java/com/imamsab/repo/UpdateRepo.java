package com.imamsab.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imamsab.Entity.UpdateTableEntity;

public interface UpdateRepo extends JpaRepository<UpdateTableEntity, Integer> {

}
