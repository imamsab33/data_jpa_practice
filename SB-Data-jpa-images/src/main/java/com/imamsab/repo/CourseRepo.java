package com.imamsab.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.imamsab.entity.Course;

public interface CourseRepo extends JpaRepository<Course, Integer> {

	@Query("select id,name from Course ")
	public List<Object[]> getSpecificCol();

}
