package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Javaconfig {
	@Bean
	public Course getCourse() {
		return new Course();
	}
    @Bean
	public Student1 getStudent1() {
		Student1 student1 = new Student1(getCourse());
		return student1;
	}
//    @Bean
//	public Student1 getStudent1() {
//		Student1 student1 = new Student1();
//		return student1;
//	}

}
