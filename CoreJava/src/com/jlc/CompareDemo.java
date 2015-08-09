package com.jlc;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CompareDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student[] stuArray = new Student[] { new Student(10, "Ashish"),
				new Student(11, "Someshwar"), new Student(15, "Nandu"),
				new Student(8, "pappi"), new Student(9, "yamini") };
		System.out.println("Initial Array");
		for (int i = 0; i < stuArray.length; i++) {
			System.out.println(stuArray[i].toString());
		}

		System.out.println("\nArray after default sorting");
		Arrays.sort(stuArray);
		
		for (int i = 0; i < stuArray.length; i++) {
			System.out.println(stuArray[i].toString());
		}
		
		System.out.println("\nArray after comparator");
		Arrays.sort(stuArray, new Student.StudentComparator());
		for (int i = 0; i < stuArray.length; i++) {
			System.out.println(stuArray[i].toString());
		}
		/*
		Set<A> studentSet = new TreeSet<A>();
		studentSet.add(new A(10,"Ashish"));
		studentSet.add(new A(11,"Someshwar"));
		studentSet.add(new A(15,"Madhu"));
		studentSet.add(new A(9,"Raja"));
		studentSet.add(new A(8,"Ram"));
		
		Iterator it=studentSet.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
		
		Set<Student> studentSet2 = new TreeSet<>(new Student.StudentComparator());
		studentSet2.add(new Student(10,"Ashish"));
		studentSet2.add(new Student(11,"Someshwar"));
		studentSet2.add(new Student(15,"Madhu"));
		studentSet2.add(new Student(9,"Raja"));
		studentSet2.add(new Student(8,"Ram"));
		
		for (Iterator<Student> iterator = studentSet2.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
			
		}
	}

}
