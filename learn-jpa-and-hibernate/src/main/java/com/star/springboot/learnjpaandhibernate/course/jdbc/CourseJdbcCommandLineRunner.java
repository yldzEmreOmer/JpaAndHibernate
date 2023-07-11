package com.star.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.star.springboot.learnjpaandhibernate.course.Course;
import com.star.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.star.springboot.learnjpaandhibernate.course.springjpa.CourseSpringDataJpaRepository;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{

	//@Autowired
	//private CourseJdbcRepository repository;
	
	//@Autowired
	//private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		/*
		repository.insert(new Course(1,"Java", "Teacher A"));
		
		repository.insert(new Course(2,"C#", "Teacher B"));
		
		repository.insert(new Course(3,"Python", "Teacher C"));
		
		repository.deleteById(1);
		
		System.out.println(repository.findById(2));
		System.out.println(repository.findById(3));
*/		
		
		
		repository.save(new Course(1,"Java", "Teacher A"));
		
		repository.save(new Course(2,"C#", "Teacher B"));
		
		repository.save(new Course(3,"Python", "Teacher C"));
		
		repository.deleteById(1l);
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findByAuthor("Teacher B"));
		
	}

	
	
}
