package com.ashish;

public class X {
	int i=0;
	void funx()
	{
		i=i+1;
		i=i*i;
	}
	public static void main (String args[])
	{
		X x1 = new X();
		x1.i=2;
		x1.funx();
		System.out.println(x1.i);
	}

}
