package com.jlc;

import java.util.Scanner;

public class Lab10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements ");
		int size = sc.nextInt();
		int arr[]= new int [size];
		float sum=0,avg=0;
		System.out.println("Enter the elements ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]= sc.nextInt();	
			sum= sum+arr[i];
		    avg= sum/arr.length;
			}
		System.out.println("Average is: "+avg);
		System.out.println("Summation "+sum);
		System.out.println("Elements in natural order");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
			
		}
		
	}
	

}

