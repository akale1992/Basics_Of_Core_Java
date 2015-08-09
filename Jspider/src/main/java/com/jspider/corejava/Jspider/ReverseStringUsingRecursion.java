package com.jspider.corejava.Jspider;

public class ReverseStringUsingRecursion {
	public static int reverseRefined(int num) {
		if(num/10 == 0){ 
			return num;
		}
		
		return (int) (((num%10) * Math.pow(10, String.valueOf(num).length()-1))+ reverseRefined(num/10));
			
		//3*10+r(12) => 2*10+ r(1) => 1	
		// 300+20+1
	}
     public static int revers( int a ) {
    	 int rev = 0; 
    	 
		if (a == 0)
			return a;
		int rem = a%10;
		rev = rev * 10 + rem;
		return rev +revers( a/10);
	}
     public static void main(String[] args) {
		int a =revers( 1234567);
		System.out.println(a);
		
		System.out.println(ReverseStringUsingRecursion.reverseRefined(1234567));
	}
}
