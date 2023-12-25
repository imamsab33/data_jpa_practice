package com.imamsab.service;

import java.io.FileInputStream;
import java.util.List;

import org.springframework.stereotype.Service;

import com.imamsab.entity.Course;
import com.imamsab.repo.CourseRepo;

@Service
public class CourseService {

	private CourseRepo repo;

	public CourseService(CourseRepo repo) {
		this.repo = repo;
	}

	public void insertRecordIntoDb() {
		Course ob = new Course();
		ob.setName("java");
		try {
			FileInputStream fis = new FileInputStream("01.jpg");
			ob.setImg(fis.readAllBytes());
			fis.close();
		} catch (Exception e) {
			System.out.println();
			e.printStackTrace();
		}
		repo.save(ob);

	}

	public void getAllRecords() {

		List<Course> findAll = repo.findAll();
		findAll.forEach(System.out::println);

	}

	public void specificcol() {

		List<Object[]> specificCol = repo.getSpecificCol();

		for (Object[] objects : specificCol) {
			System.out.println("Course id: " + objects[0]+"Course name: " + objects[1]);
		}

	}

}
