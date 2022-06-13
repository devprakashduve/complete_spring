package com.springPractice.REST__Practice.entities;

public class Course {
	private long id;
	private String name;
	private String Description;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(long id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		Description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", Description=" + Description + "]";
	}
	
	
	
	

}
