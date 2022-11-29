package com.springcore.javaconfig;

public class Student1 {
	
	private Course course;
	
	public Student1(Course course) {
		super();
		this.course = course;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public void studey() {
		this.course.discount();
		System.out.println("student 1 is studying...");
	}

}
