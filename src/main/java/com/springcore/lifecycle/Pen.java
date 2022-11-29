package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pen implements InitializingBean,DisposableBean {
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pen(double price) {
		super();
		this.price = price;
	}

	public Pen() {
		super();
	}

	@Override
	public String toString() {
		return "Pen [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("init of pen method is called...");
	}

	public void destroy() throws Exception {
		System.out.println("destroy of pen method is called...");
		
	}
	

}
