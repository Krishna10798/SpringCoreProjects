package com.springcore.addition;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	    ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/addition/config.xml");
	    Addition add=(Addition) context.getBean("add");
//	    add.doSum();
	

}
