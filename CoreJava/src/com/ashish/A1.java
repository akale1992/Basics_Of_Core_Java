package com.ashish;

public class A1 extends A {

	public static void main(String args[]) {

		for (int i = 0; i < args.length; i++)
			System.out.println(args[i]);

	}
}
class B extends A1{
	void test(){
		System.out.println(super.i);
	}
	public static void main(String[] args) {
		
	}
}
