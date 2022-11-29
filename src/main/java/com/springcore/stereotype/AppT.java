package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppT {
	public static void main(String[] args) {
	    ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/stereotype/config.xml");
	    
	    System.out.println("----------singleton--------");
	    Teacher t1=con.getBean("teacher",Teacher.class);
	    Teacher t2=con.getBean("teacher",Teacher.class);
	    
	    System.out.println(t1.hashCode());
	    System.out.println(t2.hashCode());
	    
	    System.out.println("--------prototype--------");
	    Teacher t12=con.getBean("teacher2",Teacher.class);
	    Teacher t22=con.getBean("teacher2",Teacher.class);
	    
	    System.out.println(t12.hashCode());
	    System.out.println(t22.hashCode());
	    
        
	}

}
