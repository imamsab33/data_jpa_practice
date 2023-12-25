package com.imamsab.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imamsab.entity.Employee22;
import com.imamsab.repo.Employee22Repo;

@Service
public class Employee22Service  implements Employee23{
       @Autowired
       private Employee22Repo emp;

	@Override
	public List<Employee22> getAllEmployee22s() {
		// TODO Auto-generated method stub
		return emp.findAll();
	}

	@Override
	public boolean saveEmployee23(Employee22 employee) {
		Employee22 save = emp.save(employee);
		if(save.getEid() !=null) {
			return true;
		}
		return false;
	}
           
      
}
