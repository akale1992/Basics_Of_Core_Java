package com.jlc.test;

import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
       CheckNumber ch = new CheckNumber();
       int revers = ch.palindrome(number);
       int arm = ch.armstrong(number);
       if(revers == number)
    	   System.out.println("palindrome Number");
       else
    	   System.out.println("Not palindrome Number");
       if(arm == number)
    	   System.out.println("Armstrong number");
       else
    	   System.out.println("Not armstrong number");
       System.out.println("Enter the range of fibonaci series");
       int range = sc.nextInt();
       ch.fibonaci(range);
	}
	public int palindrome(int number){
		int revers =0;
		int seprate;
		while(number > 0){
			seprate =  number%10;
			revers = revers*10 + seprate;
			number = number/10;
		}
		return revers;
	}
	public int armstrong(int number){
		int arm =0;
		int seprate =0;
		while(number > 0){
			seprate = number %10;
			arm = arm + seprate * seprate* seprate;
			number =number /10;
		}
		Thread th = Thread.currentThread();
		th.setName("Ashish");
		System.out.println(th.getName());
		System.out.println(th.getId());
		System.out.println(th.getPriority());
		System.out.println(th.isAlive());
		System.out.println(th.isDaemon());
		System.out.println(th.isInterrupted());
		System.out.println(th.MAX_PRIORITY);
		return arm;
	}
	public synchronized void fibonaci(int range) {
		Thread th = Thread.currentThread();
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		notifyAll();
		int[]fib = new int[range];
		 fib[0]= 0;
		 fib[1] = 1 ;
		for(int i =2;i<fib.length;i++){
			fib[i]= fib[i-1]+fib[i-2];
		}
		System.out.println("Fibonaci series is  :");
		for (int i = 0; i < fib.length; i++) {
			System.out.print(fib[i]+" ");
		}
		
		
	}
	

}
