package com.imamsab.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imamsab.ContactusEntity;
import com.imamsab.data.CustomerEntity;
import com.imamsab.repo.ContactUsRepo;

@Service
public class service {
	@Autowired
	private ContactUsRepo repo;
 public void saveRecord() {
	 ContactusEntity cs=new ContactusEntity();
	 cs.setCmail("himasabdudekula@gamil.com");
	 cs.setCname("himamsab");
	 cs.setCphno(1332);
	 
	 ContactusEntity cs1=new ContactusEntity();
	 cs1.setCmail("imasabdudekula@gamil.com");
 cs1.setCname("imamsab");
	 cs1.setCphno(332);
	  List<ContactusEntity> list = Arrays.asList(cs, cs1);
		repo.saveAll(list);
	 
 }
}
