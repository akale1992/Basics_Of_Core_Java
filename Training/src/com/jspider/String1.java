package com.jspider;

public class String1 {
	String s1 = "java134app56dev89";
	void m1(){
		for (int i = 0;  i< s1.length() ; i++) {
			StringBuffer sb =new StringBuffer("");
			if('0'<= s1.charAt(i) && '9'>= s1.charAt(i)){
			    sb+s1.charAt(i);	
			}
		}
	}
	public static void main(String[] args) {
		
	}

}
