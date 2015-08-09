package com.ashish;

public class Sample1 {
	public static void main(String args[]) {
		byte b1=1;
		Byte b= new Byte(b1+"");
		byte b2=b.byteValue();
		int i1=b.byteValue();//widening/automatic casting + unboxing
		int i=129;
		byte b3=(byte) i;//casting
		System.out.println(b3);
		
		Byte b4=1;//Byte b4=new Byte(1); //boxing
		
		Boolean bool1=Boolean.parseBoolean("tRue");
		
		
		
		System.out.println(bool1);
		System.out.println("ashisha1".lastIndexOf("1"));
		
		char [] charArray={'a','b','c'};
//		String s1 = "Sachin";
//		String s2 = "Sachin";
//		String s3 = new String("Sachin");
//
//		System.out.println(s1 == s2);// true (because both refer to same
//										// instance)
//		System.out.println(s1 == s3);// false(because s3 refers to instance
//										// created in nonpool)

		StringBuilder s1 = new StringBuilder("Sachin");
		StringBuilder s2 = new StringBuilder("Ashish");
		StringBuilder s3 = s1;
		
		s3.append("Ashok");
		System.out.println(s1);

		System.out.println(s1 == s2);// true (because both refer to same
										// instance)
		System.out.println(s1 == s3);// false(because s3 refers to instance
										// created in nonpool)
		//string is immutable i.e. we can not change the contets if u have ref.
		String s4 = new String("Sachin");
		String s5 = new String("Ashish");
		String s6 = s4;
		
		s6=s6.concat("Ashok");
		System.out.println(s4);

		System.out.println(s4 == s5);// true (because both refer to same
										// instance)
		System.out.println(s4 == s6);// false(because s3 refers to instance
										// created in nonpool)


//		System.out.println(s1.toUpperCase());
//		System.out.println(s2.toLowerCase());
		
	}

}
