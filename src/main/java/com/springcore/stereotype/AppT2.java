package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppT2 {
	public static void main(String[] args) {
	    ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/stereotype/config.xml");
	    
	    System.out.println("----------singleton & prototype--------");
	    Teacher2 t1=con.getBean("teacher22",Teacher2.class);
	    Teacher2 t2=con.getBean("teacher22",Teacher2.class);
	    
	    System.out.println(t1.hashCode());
	    System.out.println(t2.hashCode());
	    
	    
	    
        
	}

}
