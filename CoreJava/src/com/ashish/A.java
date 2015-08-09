/**
 * 
 */
package com.ashish;

/**
 * @author Ashish1992
 *
 */
    class A {
	int i,j;
	A(){

		System.out.println("Inside constructor A()");
		i=5;
		j=10;
	}
    void function(){
    	System.out.println("Inside function");
    	System.out.println(i);
    	System.out.println(j);
    	
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		a2.function();
		
	}

}
