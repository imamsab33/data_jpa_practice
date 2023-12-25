package com.beemesh.repository;

import org.springframework.data.repository.CrudRepository;

import com.beemesh.entity.Employee;

public interface EmployeeRepo extends  CrudRepository<Employee, String> {
 

}
