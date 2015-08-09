package com.cts;

public class Circle {
	
     static final double PI; 
     static{
    	 PI = 3.1456;
     } 
	public static void main(String[] args) {
		// 
     Circle.area(5);
     Circle.circumference(6);

	}
	static void area(int r){
	double res = PI *r*r;
	System.out.println("Area of circle is :"+res);
	}
	static void circumference(int r){
		double res = 2*PI *r;
		System.out.println("circumference of circle is :"+res);
		}

}
