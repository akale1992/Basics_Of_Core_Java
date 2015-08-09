package com.jlc.test;

import java.util.Scanner;

public class StringCount {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of element(size)");
		int size = sc.nextInt();
		System.out.println("Enter the numbers");
		int [] arr = new int[size];
		int sum=0;
		float average =0;
		int min =Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum =sum+ arr[i];
			
			
			if(arr[i] < min)
				min=arr[i];
			if(arr[i]>max)
				max = arr[i];
		}
		average = (float)sum/arr.length;
		System.out.println("Average of numbers is"+average);
		System.out.println("Minimum numbers is"+min);
		System.out.println("Maximum number is"+max);
		StringCount rv = new StringCount();


	}

}
class B extends StringCount{
	static void main(){
		
	}
	static void main(int a){
		
	}
}
