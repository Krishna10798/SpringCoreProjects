package com.springcore.autowireXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.primitive.Student;

/**
 * printing data from bean using IOC container
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowireXML/config.xml");
        Emp emp1=context.getBean("emp1",Emp.class);
        System.out.println(emp1);
    }
}
