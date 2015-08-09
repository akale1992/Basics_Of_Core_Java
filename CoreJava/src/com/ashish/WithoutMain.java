package com.ashish;

class Test{
	private int i;
	
	public Test(int i) {
		this.i=i;
	}
	
	public int incrementTest() {
		return ++this.i;
	}
}
public class WithoutMain {
	static {
		Test t= new Test(12);
		System.out.println(t.incrementTest());
	}
	
	public static void main(String[] args) {
		System.out.println("in main");
	}
}
