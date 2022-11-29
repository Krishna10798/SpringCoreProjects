package com.springcore.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/SpEL/config.xml");
		Demo d1=con.getBean("demo",Demo.class);
		System.out.println(d1);
		
		
		SpelExpressionParser spelExpressionParser = new SpelExpressionParser();
		
		Expression parseExpression = spelExpressionParser.parseExpression("22+22");
		System.out.println(parseExpression.getValue());

	}

}
