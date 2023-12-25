package com.imamsab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imamsab.entity.Employee13;
import com.imamsab.repo.EmployeeRepo;

@Service
public class EmployeeService {
       @Autowired
       private EmployeeRepo emprepo;
          
       
       public void saveRecords(Employee13 emp) {
    	   emprepo.save(emp);
       }
}
