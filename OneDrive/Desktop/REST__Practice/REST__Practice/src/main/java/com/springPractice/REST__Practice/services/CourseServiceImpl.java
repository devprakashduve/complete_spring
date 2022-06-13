package com.springPractice.REST__Practice.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springPractice.REST__Practice.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	List<Course> list;
	

	public CourseServiceImpl() {
		list=new ArrayList<>();		
		list.add(new Course(11,"Java core Course","this cource will give you basics of java concept"));
		list.add(new Course(21,"Sprint boot  Course","this cource will give REST api development with springboot"));		
	}


	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

}
