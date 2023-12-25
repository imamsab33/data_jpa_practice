package com.beemesh.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beemesh.entity.Employee;
import com.beemesh.repository.EmployeeRepo;

@Service
public class EmployeeService {

	private EmployeeRepo emprepo;
	public EmployeeService(EmployeeRepo emprepo) {
		// TODO Auto-generated constructor stub
		this.emprepo=emprepo;
	}

	public void saveService() {
		 
		Employee em=new Employee();
		em.setDept("Admin");
		em.setEname("Raj");
		em.setEno(101);
		 
		Employee em1=new Employee();
		em1.setDept("Maths");
		em1.setEname("Raja");
		em1.setEno(102);
		emprepo.save(em1);
		List<Employee> List=Arrays.asList(em, em1);
		emprepo.saveAll(List);}
	

	        
	
	
		}
