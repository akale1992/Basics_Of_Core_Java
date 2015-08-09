package com.ashish;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class ArrayListDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al1= new ArrayList();
		al1.add("Ashish");
		al1.add("Satish");
		al1.add("Praful");
		
		Iterator i= al1.iterator();
		
		for (Iterator iterator = al1.iterator(); iterator.hasNext();) {
			String str = (String) iterator.next();
			System.out.println(str);
			//iterator.remove();
		}
		Collections.sort(al1);
		System.out.println("iterator2");
		for (Iterator iterator = al1.iterator(); iterator.hasNext();) {
			String str = (String) iterator.next();
			System.out.println(str);	
		}
		
		ArrayList al2= new ArrayList();
		al1.add("Ashish");
		al1.add("Somesh");
		al1.add("Ram");
		
		System.out.println(al1.contains(new String("Ashish")));
		//System.out.println(al1.);
		
		

	}

}
