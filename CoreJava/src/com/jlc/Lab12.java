package com.jlc;

import javax.management.RuntimeErrorException;

public class Lab12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Ashish";
		String s2 = "Ashish";
		String s3 = new String("Ashish");
		String s4 =s3.intern();
		String s5 = new String("Som");
//		System.out.println(s1 == s2);
//		System.out.println(s1 == s3);
//		System.out.println(s1 == s4);
//		System.out.println(s1.equals(s2));
//		System.out.println(s3.equals(s4));
//		System.out.println(s4.equals(s5));
//		System.out.println(s4.compareTo(s5));
//	    System.out.println(s3.substring(2));
//	    System.out.println(s2.startsWith("A"));
//	    System.out.println(s2.endsWith("f"));
//	    System.out.println(s2.charAt(4));
//	    double d =10.0;
//	    String s6 = s2.valueOf(d);
//	    System.out.println(s6);
//		System.out.println(s5.contains("o"));
//		System.out.println(s2.replace('s', 'm'));
//		System.out.println(s2.replace('s', 'm'));
//		System.out.println(s4.indexOf('i'));
//		System.out.println(s4.indexOf("hia"));
//		System.out.println(s2.toString());
//		System.out.println(s2.hashCode());
//		System.out.println(s2.getClass());
//		
	String s6 = s1.concat("Ashish");
	try {
	int x =10/0;	
	System.out.println(s6);
	System.out.println(s1.matches("Asish"));
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("something wrong");
	}
	char ca[] = s1.toCharArray();
	for (int i = ca.length-1;i>=0; i--) {
		System.out.println(i+"\t"+ca[i]);
		
	}
	Integer ref = Integer.parseInt("2345");
	int x = ref.intValue();
	System.out.println(x);
	Byte b1 = new Byte((byte) 121);
	Byte b2 = 121;
	System.out.println(b2);
	b2=122;
	System.out.println(b2);
	System.out.println(b2);
	System.out.println(b2.getClass());
	System.out.println(b1.hashCode() +"==" +b2.hashCode());
	System.out.println(b1 == b2);
	
	
	String name="Ashish";
	name.concat("Kale");
	System.out.println(name);
	
	
	System.exit(0);
	
		

	}

}
