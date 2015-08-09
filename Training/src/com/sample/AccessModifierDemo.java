package com.sample;

import com.cts.DataTypeDemo;



 class SuperClass {
	protected int i ;
	private int j = 2;
	int k;
	static int s;
	public SuperClass() {
		// TODO Auto-generated constructor stub
		
		System.out.println("from super class constructor");
	}
	
	public SuperClass(int i, int k) {
		// TODO Auto-generated constructor stub
		this.i=i;
		this.k=k;
		
		
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
	
	
	public void instanceMethod(int i) {
		System.out.println("From Super Class instance method with arg" + i);
	}
	
	protected void instanceMethod() {
		System.out.println("From Super Class instance method");
	}
	
	public static void staticMethod() {
		System.out.println("From Superclass static method");
	}
}


class SubClass extends SuperClass{
	int d;

 // return type same
	//visibility should be same or wider protected -> public but not -> default or private
	// no. of arguments should be same and all are of same type resp.
	public void instanceMethod() {
		
		super.instanceMethod();//calling super class instance method
		System.out.println("From sub Class instance method");
	}
	
	//hiding
	public static void staticMethod() {
		System.out.println("From sub class static method");
	}
}

public class AccessModifierDemo {

	public static void main(String[] args) {
		SuperClass superClass1= new SuperClass();
		
		superClass1.staticMethod();
		superClass1.instanceMethod(123);
		
		SuperClass superClass2;
		superClass2= new SubClass();
		
		superClass2.instanceMethod();
		superClass2.staticMethod();
		
		SubClass subClass1= new SubClass();
		subClass1.instanceMethod();
		subClass1.staticMethod();
		System.out.println(subClass1.s);
		
	}

}
