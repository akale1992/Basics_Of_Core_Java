package com.cts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Lab {
	static int min, max;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value of Number of elements N ");
//		int N = sc.nextInt();
//		
//		float avg =0 , sum = 0;
//		int arr [] = new int [N];
//		for (int i = 0; i < arr.length; i++) {
//			 arr [i] = sc.nextInt(); 
//			 sum =sum + arr[i];
//			 avg = sum/arr.length;
//			 min = arr[0];
//			 if (min > arr[i])
//				 min = arr [i];
//			 
//			 
//		}
//		System.out.println("summation "+sum);
//		System.out.println("Average  "+avg);
//		System.out.println("Minimum  "+min);
		ArrayList<Integer> al = new ArrayList<>();
		al.add(2);
		al.add(4);
		al.add(5);
		al.add(6);
		System.out.println(al);
         ArrayList<Integer> al1 = new ArrayList<>();
         al1.add(7);
         al1.add(8);
         al1.add(4);
         System.out.println(al1);
         System.out.println(al1.isEmpty()); 
         System.out.println(al1.contains(7));
         System.out.println(al1);
         Collections.sort(al);
         System.out.println(al);
//        al1.clear();
//        System.out.println(al1);
//        System.out.println(al1.removeAll(al));
//        System.out.println(al1);
//        System.out.println(al1.containsAll(al));
//         Iterator it = al.iterator();
//         while (it.hasNext()) {
//			Object object = (Object) it.next();
//			
//			
//		}
	}

}