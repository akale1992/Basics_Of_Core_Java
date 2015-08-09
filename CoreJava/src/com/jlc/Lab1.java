package com.jlc;

import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		if(n==2 || n ==3 || n==5 || n ==7){
			System.out.println(" prime");
		}
		else if (n%2==0 || n%3 ==0 || n%5==0 || n%7 ==0) {
			
			System.out.println("not prime");
		} else {
			System.out.println(" prime");

		}

	}

}
