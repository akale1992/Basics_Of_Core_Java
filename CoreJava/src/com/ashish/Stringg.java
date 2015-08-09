package com.ashish;

public class Stringg {
	public static void main(String[] args) {
		String s = "Ashish, Maroti, Kale";
		String p = s.concat("+pandhari");
		System.out.println(p);
		String r= "Dshish, Maroti, Kale";
		String t=s.toUpperCase();
		System.out.println(t+" "+s);
		String[] m = p.split(",");
		for (int i = 0; i < m.length; i++) {

			System.out.println(m[i]);
		}
		System.out.println(s.equalsIgnoreCase(r));
		System.out.println(s.compareTo(r));
		System.out.println(s==r);
		System.out.println(s==p);
		 String s1="Sachin";  
		   String s2="Sachin";  
		   String s3="Aatan";  
		  
		   System.out.println(s1.compareTo(s2));//0  
		   System.out.println(s1.compareTo(s3));//1(because s1>s3)  
		   System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )  
		   System.out.println(s1+s2);
		   System.out.println(1+7/8*2.0+1);
		   System.out.println(7/8l);
		   
		   
		   //immutable
		   //final class
		   // if you have reference with you, we can not change the content
		   String imm="immutable";
		String c=   imm.concat(" yes");
		   
		   System.out.println(c);//immutable
		   
		   String s5= new String();
		
		   
		   System.out.println(s5);
		   
		   //mutable		   
		  StringBuilder imm1=new StringBuilder("immutable");
		  StringBuilder s4= imm1.append(" yes");
		   
		   System.out.println(s4);//immutable yes
		   System.out.println("     asish       ".trim());
	}
	

}
