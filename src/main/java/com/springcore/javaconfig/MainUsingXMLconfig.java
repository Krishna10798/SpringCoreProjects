package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainUsingXMLconfig {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/javaconfig/config.xml");
		Student s1 = con.getBean("mystudent",Student.class);
		System.out.println(s1);
		s1.studey();
	}

}
