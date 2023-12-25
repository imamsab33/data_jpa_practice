package com.beemesh;

import org.springframework.stereotype.Service;

import com.beemesh.entities.EmployeeEntity;
import com.beemesh.repo.EmployeeRepo;
@Service
public class EmployeeService {
	
	   private EmployeeRepo emprepo;
	    
	    public EmployeeService(EmployeeRepo emprepo) {
                  this.emprepo=emprepo;	    	
		}
	  public void SaveEmp() {
		  EmployeeEntity e = new EmployeeEntity();
		    e.setId(103);
		    e.setEmpname("himamsab");
		    e.setEmpsalary(102.0);
		      emprepo.save(e);
	  }

}
