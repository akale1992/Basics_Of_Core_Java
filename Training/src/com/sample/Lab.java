package com.sample;

import java.util.Scanner;

public class Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1 ="jlc    ";
//		System.out.println(s1);
//		System.out.println(s1.trim());
//		String s2 = new String("jLc");
//		String s3 = s2.intern();
//		System.out.println(s1==s2);
//		System.out.println(s2==s3);
//		System.out.println(s1==s3);
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.compareTo(s2));
//		StringBuffer s4 = new StringBuffer("ashish");
//		System.out.println(s4.capacity());
//		s4.append(0.0f);
//		System.out.println(s4);
//		s4.insert(3, "java");
//		System.out.println(s4);
//		s4.deleteCharAt(0);
//		System.out.println(s4);
//		s4.delete(3, 5);
//		System.out.println(s4);
//		s4.reverse();
//		System.out.println(s4);
//		System.out.println(s4.capacity());
//		System.out.println(s4.deleteCharAt(6));
//		System.out.println(s4.capacity());
//		String original,revers="";
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter any string");
//		original = sc.nextLine();
//		for (int i = original.length()-1; i > 0 ; i--) {
//			revers=revers +original.charAt(i);
//		}
//		System.out.println(revers);
//		String s ="java learning centre is no 1 for java";
//		String[] as = s.split("\\s");
//		int count = 0;
//		for (String string : as) {
//			count++;
//		}
//		System.out.println("no of words present is"+count);
//		System.out.println(s.hashCode());
//		Object ob1 = new Object();
//		Object ob2 = new Object();
//		Object ob3 = ob2;
//		
//		System.out.println(ob1.hashCode());
//		System.out.println(ob3.hashCode());
//		System.out.println(ob1.getClass());
//		System.out.println(ob1.equals(ob2));
//		System.out.println(ob2.equals(ob3));
//		System.out.println(ob1.toString());
//		System.out.println(ob1);
//		System.out.println(s.getClass());
		Hello h = new Hello();
		MyThred th1 = new MyThred(h);
		MyThred th2 = new MyThred(h);
		Thread t1 = new Thread(th1,"Ashish");
		Thread t2 = new Thread(th2,"Mangesh");
		t1.start();
		t2.start();
		t2.setPriority(10);
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

}
