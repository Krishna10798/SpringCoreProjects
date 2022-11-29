package com.springcore.lifecycle;

public class Book {
	
	private double price;
	
	
	public void init() {
		System.out.println("Inside init method...");
	}
	public void destroy() {
		System.out.println("Inside destroy method...");
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Book() {
		super();
	}

	public Book(double price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [price=" + price + "]";
	}
	
	

}
