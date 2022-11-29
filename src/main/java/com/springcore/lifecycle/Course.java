package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Course {
	
	private String Subject;
	@PostConstruct
	public void start() {
		System.out.println("Inside start method...");
	}
	@PreDestroy
	public void end() {
		System.out.println("Inside end method...");
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public Course(String subject) {
		super();
		Subject = subject;
	}

	public Course() {
		super();
	}

	@Override
	public String toString() {
		return "Course [Subject=" + Subject + "]";
	}
	

}
