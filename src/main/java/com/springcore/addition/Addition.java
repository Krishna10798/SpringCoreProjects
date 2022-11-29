package com.springcore.addition;

public class Addition {
	
	private int a;
	private int b;
	
	
	public Addition(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println("constructure of int int called...");
	}
	public Addition(double a,int b) {
		this.a=(int)a;
		this.b=b;
		System.out.println("constructure of double int called...");
	}
	public Addition(double a,double b) {
		this.a=(int)a;
		this.b=(int)b;
		System.out.println("constructure of double double called...");
	}
	public Addition(double a,String b) {
		this.a=(int)a;
		this.b=Integer.parseInt(b);
		System.out.println("constructure of double String called...");
	}
	public void doSum() {
		System.out.println("Sum is: " +(this.a+this.b));
	}

}
