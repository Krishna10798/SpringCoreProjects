package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
	    ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/config.xml");
        Person p1= con.getBean("person1",Person.class);
        System.out.println(p1);
        System.out.println("-------------");
        System.out.println(p1.getProperties());
	}

}
