package com.ashish;

abstract class Xyz1 {
	private double d;

	public Xyz1(double d) {
		// TODO Auto-generated constructor stub
		this.d = d;

	}

	public void show() {
		System.out.println("the value of instance variable is " + d);
	}
}

public class Abc1 extends Xyz1 {
	private double d;

	public Abc1() {
		// TODO Auto-generated constructor stub
		super(10);
	}

	public static void main(String[] args) {
		Abc1 a1 = new Abc1();
		System.out.println(a1.d);
		a1.show();
		String revers = "";

		String st = "Ashish kale";
		StringBuffer s = new StringBuffer( "");
		System.out.println(s.capacity());
        char[] ch =st.toCharArray();

		for (int i = ch.length-1; i >= 0; i--) {
			revers = revers + ch[i];
		}
		System.out.println("revers string is " + revers);
	}
}
