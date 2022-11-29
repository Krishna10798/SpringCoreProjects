package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

@Component("mystudent")
public class Student {
	
	public void studey() {
		System.out.println("student is studying...");
	}

}
