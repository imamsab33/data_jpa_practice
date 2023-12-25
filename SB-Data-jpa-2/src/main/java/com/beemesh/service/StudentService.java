package com.beemesh.service;

import com.beemesh.io.student;
import com.beemesh.io1.IStudent;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired
	private IStudent stu;
//public StudentService(IStudent stu) {
//	this.stu=stu;

//}

	public void saveStudent() {
		student stude = new student();
		stude.setSid(101);
		stude.setName("himamsab");
		stude.setPhno(123456);

		
		student stude1 = new student();
		stude1.setSid(101);
		stude1.setName("himamsab");
		stude1.setPhno(123456);
		stu.saveAll(stu);
	        //  List<student> list = Arrays.asList(stude,stude1);
//	          stu.saveAll(stu);
	}
}
