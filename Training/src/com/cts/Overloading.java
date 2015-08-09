package com.cts;

public class Overloading {
	protected int i = 1;
	private int j = 2;
	int k = 3;

	// /constructor overloading
	public Overloading() {
		// TODO Auto-generated constructor stub
		System.out.println("From default");
	}

	public Overloading(long i) {
		// TODO Auto-generated constructor stub
		this();// call other constructor having same argument both nor and type
		System.out.println("From long constructor");
	}

	public Overloading(int i) {
		// TODO Auto-generated constructor stub
		this(0L);
		System.out.println("From int constructor");
	}

	public static void instanceMethod() {
		System.out.println("From superclass instancemethod");
		// we can call//System.out.println(i+" "+j+" "+k);
	}

	public void instanceMethod(int i) {
		System.out.println("From int");
		System.out.println(i + " " + j + " " + k);
	}

	// /same name, number of arguments, if no. of args same then argument type
	// checking if again same error
	int instanceMethod(long i) {
		System.out.println("From long");
		System.out.println(i + 1 + " " + j + " " + k);
		return 1;
	}

	public static void main(String[] args) {
		Overloading superClass = new Overloading(1);
		superClass.instanceMethod(1L);
	}

}
