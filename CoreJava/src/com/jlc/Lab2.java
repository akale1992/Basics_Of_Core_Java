package com.jlc;

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		boolean isPrime = true;
		for(int nextNumber=2;nextNumber<=n-1;nextNumber++){
			if (n%nextNumber == 0) {
				c=1;
				isPrime = false;
				break;
				
			}
		}	
			if (isPrime) {
				System.out.println("  prime");
				
			} else {
				System.out.println("not prime");

			}
			
		

	}

}
