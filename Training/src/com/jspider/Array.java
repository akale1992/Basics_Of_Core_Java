package com.jspider;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter size andthe   element of an array  :");
		
		int size = sc.nextInt();
		int array [] = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		int max = Array.checkMax(array);
		System.out.println("Maximum number of array is  :"+max);

	}
	static int  checkMax(int array[]){
		int max = array [0];
		for (int i = 0; i < array.length; i++) {
			if(array[i] > max)
				max = array[i];
		}
		return max;
				
	}

}
