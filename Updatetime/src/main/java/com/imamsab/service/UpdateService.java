package com.imamsab.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.imamsab.Entity.UpdateTableEntity;
import com.imamsab.repo.UpdateRepo;

@Service
public class UpdateService {
	
	private UpdateRepo repos;
	
	public UpdateService(UpdateRepo repos) {
		this.repos=repos;
		
	}
	public void saveRecords(){
		UpdateTableEntity ute=new UpdateTableEntity();
	      ute.setSname("himamsab");	
	      ute.setEmail("himamsab@gmail.com");
	      
	      UpdateTableEntity ute1=new UpdateTableEntity();
	      ute1.setSname("divya");	
	      ute1.setEmail("divya@gmail.com");
	      
	      UpdateTableEntity ute2=new UpdateTableEntity();
	      ute2.setSname("bheemesh");	
	      ute2.setEmail("bheemesh@gmail.com");
	      
	      UpdateTableEntity ute3=new UpdateTableEntity();
	      ute3.setSname("prasad");	
	      ute3.setEmail("prasad@gmail.com");
	      
	      List<UpdateTableEntity> asList = Arrays.asList(ute,ute1,ute2,ute3);
	      repos.saveAll(asList);
	      
	}
	

}
