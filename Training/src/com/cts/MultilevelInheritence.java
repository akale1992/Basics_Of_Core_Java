package com.cts;

class A{
	int i=1,j=2;
	public void method1() {
		System.out.println("From A method 1");
	}
	
	public void mtethod2() {
		System.out.println("From A method 2");
	}
}
class B extends A{
	int i=3,j=4,k=7;
	
	public void method1() {
		System.out.println("From B method1");
	}
	
	public void method3() {
		System.out.println("From B method 3");
	}
	
}
class C extends B{
	int i=5,j=6, k=3;
	public void method1() {
		System.out.println("From c method1");
	}
	
	public void method3() {
		System.out.println("From c method 3");
	}
	
	public void method4() {
		System.out.println("from c method 4");
	}
	
}

public class MultilevelInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1=new C();
		a1.method1();
		// we can assign any subclass object to superclass ref.
		/// at compile time ,all the methods from superclass can call only its method and not the methods from subclass
		//overrided method calls from leaf subclass to superclass at runtime
		
		//we cant override variables ..
		//we can call those variables
		System.out.println(a1.i);//1
		
		B b1 = new C();
		b1.method1();
		b1.mtethod2();
		
		
		
	
	}

}
