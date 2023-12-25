package com.imamsab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imamsab.entity.Student1;
import com.imamsab.repo.Student1repo;
@Service
public class Student1Service {

	    @Autowired
	    private Student1repo repo;
	    
	    public List<Student1> listAll() {
	        return repo.findAll();
	    }
	     
	    public void save(Student1 std) {
	        repo.save(std);
	    }
	     
	    public Student1 get(long id) {
	        return repo.findById(id).get();
	    }
	     
	    public void delete(long id) {
	        repo.deleteById(id);
	    }

	}

