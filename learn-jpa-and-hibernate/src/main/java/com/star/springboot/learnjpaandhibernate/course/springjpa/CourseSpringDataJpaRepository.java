package com.star.springboot.learnjpaandhibernate.course.springjpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.star.springboot.learnjpaandhibernate.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long>{
	
	List<Course> findByAuthor(String author);

}
