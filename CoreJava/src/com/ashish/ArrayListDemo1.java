package com.ashish;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> al= new LinkedList<>();
		al.add("Ashish");
		al.add("Ashish1");
		al.add("Ashish2");
		al.add("Ashish3");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			String value = (String) itr.next();
			System.out.println(value);
			
		}
		
		int count=0;
		ListIterator<String> ltr=al.listIterator(al.size());
		while (ltr.hasPrevious()) {
			
			ltr.previous();
			
			count++;
			if (count==3) {
				ltr.remove();
			}
	
		}
		itr = al.iterator();
		while (itr.hasNext()) {
			String value = (String) itr.next();
			System.out.println(value);
			
		}
		

	}

}
