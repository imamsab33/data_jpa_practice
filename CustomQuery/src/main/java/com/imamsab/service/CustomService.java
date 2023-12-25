package com.imamsab.service;

import org.springframework.stereotype.Service;

import com.imamsab.repo.CustomRepo;

@Service

public class CustomService {
	private CustomRepo custom;
    public CustomService(CustomRepo custom) {
	   this.custom=custom;
	}
    public void addRecords(String firstName,String lastName)
    {
    	
		custom.insertPerson(firstName, lastName);
    }
}
