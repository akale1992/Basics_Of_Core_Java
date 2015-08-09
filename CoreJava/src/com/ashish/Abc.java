package com.ashish;
abstract  class Xyz  {
	      private double d;
	   
	    	 public Xyz(double d) {
				// TODO Auto-generated constructor stub
	    		 this.d = d;
	    		 
			}
	    	public void show() {
				System.out.println("the value of instance variable is "+d);
			} 
	    }

public class Abc extends Xyz{
	private double d;
	public Abc() {
		// TODO Auto-generated constructor stub
		super(10);
	}
	public static void main(String[] args) {
		Abc a1 = new Abc();
		System.out.println(a1.d);
		a1.show();

	}
}
