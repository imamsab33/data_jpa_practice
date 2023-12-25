package com.imamsab;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imamsab.entity.Adress2;
import com.imamsab.entity.Employee4;
import com.imamsab.repo.Adressrepo2;
import com.imamsab.repo.EmployeeRepo4;

import jakarta.transaction.Transactional;

@Service
public class PermanentService {
	   @Autowired
       private Adressrepo2 adress;
	   @Autowired
	   private EmployeeRepo4 repo4;
	     
	   @Transactional
	   public Employee4 saveTheAdress(Employee4 emp) {
		   
		   emp.setName("himamsab");
		   Adress2 presentAddress = new Adress2();
	        presentAddress.setPresentAdress("123 Main St");

	        Adress2 permanentAddress = new Adress2();
	        permanentAddress.setPermentAdress("456 Oak St");

	        emp.getAdress().add(presentAddress);
	        emp.getAdress().add(permanentAddress);
		   for(Adress2 adres:emp.getAdress())
			   adress.save(adres);
	   
	  
          return repo4.save(emp);  
	   
}
}