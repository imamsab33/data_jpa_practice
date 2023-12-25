package com.beemesh.io1;

import org.springframework.data.repository.CrudRepository;

import com.beemesh.io.student;

public interface IStudent extends CrudRepository<student, Integer> {

	void saveAll(IStudent stu);



	


	

}
