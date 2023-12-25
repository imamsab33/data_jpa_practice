package com.imamsab.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imamsab.entity.Course;

public interface CourseRepo extends JpaRepository<Course, Serializable> {

}
