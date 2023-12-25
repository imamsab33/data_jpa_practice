package com.beemesh.repo;

import org.springframework.data.repository.CrudRepository;

import com.beemesh.entities.EmployeeEntity;

public interface EmployeeRepo  extends CrudRepository<EmployeeEntity, Integer>{

}
