package com.springcore.collection;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.reference.A;


/**
 * printing data from bean using IOC container
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/reference/rconfig.xml");
        A a=(A) context.getBean("aref");
        A a1=(A) context.getBean("aref1");

        System.out.println(a);
        System.out.println(a.getX());
        System.out.println(a.getObj().getY());
        
        System.out.println("------------");
        System.out.println(a1);
        System.out.println(a1.getX());
        System.out.println(a1.getObj().getY());
    }
}
