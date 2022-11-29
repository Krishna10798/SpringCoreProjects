package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainUsingJAVAconfig {
public static void main(String[] args) {
	ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/javaconfig/config.xml");
	Student s = con.getBean("mystudent",Student.class);
	System.out.println(s);
	s.studey();

	ApplicationContext con1=new AnnotationConfigApplicationContext(Javaconfig.class);
	Student1 s1 = con1.getBean("getStudent1",Student1.class);
	System.out.println(s1);
	s1.studey();
}
}
