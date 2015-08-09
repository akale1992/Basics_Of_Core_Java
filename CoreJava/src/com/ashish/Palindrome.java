package com.ashish;

public class Palindrome {
	 public static void main( String... args)
	  {
	   int a=242;
	   int  n=a,b=a,rev=0;
	   while(n>0)
	   {
	     a=n%10;
	     rev=rev*10+a;
	     n=n/10;
	   }
	   if(rev==b)
	   System.out.println("it is Palindrome");
	   else
	   System.out.println("it is not palinedrome");
	  
	  }

}
