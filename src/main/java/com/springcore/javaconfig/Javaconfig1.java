package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Javaconfig1 {
	 @Bean
		public Student getStudent() {
			Student student = new Student();
			return student;
		}
}
