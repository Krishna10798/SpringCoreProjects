package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		 AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
//		 Book b=(Book) context.getBean("b1");
//		 System.out.println(b);
		 context.registerShutdownHook();
//		 
//		 System.out.println("------------------------------------");
//		 
//		 Pen p=(Pen) context.getBean("p1");
//		 System.out.println(p);
		 
		 System.out.println("------------------------------------");
		 
		 Course c=(Course) context.getBean("c1");
		 System.out.println(c);

	}

}
