package com.springPractice.REST__Practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springPractice.REST__Practice.entities.Course;
import com.springPractice.REST__Practice.services.CourseService;

// t
@RestController
public class MyController {
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public String home() {
		
		return "Hey Siddanth How are you";	
	}
	
	// get courses 
	@GetMapping("/courses")
	public List<Course> getCourses(){
		
		return this.courseService.getCourses();
	}

}
