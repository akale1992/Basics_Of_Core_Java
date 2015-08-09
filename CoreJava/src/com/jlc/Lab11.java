package com.jlc;

import java.util.Scanner;

public class Lab11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

		}
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("maximum" + max);
		System.out.println("Minimum" + min);
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i]> arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				
			}
		}
			System.out.println("Elements in ascending order ");
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]+"\t");
				
			}
		

	}
	

}
