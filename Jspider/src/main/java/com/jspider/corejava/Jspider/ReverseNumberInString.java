package com.jspider.corejava.Jspider;

public class ReverseNumberInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringrevers();
//		String inputString = "qweew";
//		StringBuilder charArray = new StringBuilder();
//		StringBuilder numberArray = new StringBuilder();
//		//boolean isNumber=false;
//		for (char character : inputString.toCharArray()) {
//			if(!Character.isDigit(character) ){
//				if(numberArray.length()>0)
//				{
//					charArray.append(numberArray.reverse());
//					numberArray.delete(0, numberArray.length());
//					//isNumber=false;
//				
//				}
//				charArray.append(character);
//				
//			}
//			else {
//				numberArray.append(character);
				//isNumber=true;
				
//			}
//		}
//		charArray.append(numberArray.reverse());
//		System.out.println(charArray);
	}
	static void  stringrevers(){
		String s1 = "234java234app34rt";
		String s2 = "";
		for (int i = 0; i <= s1.length()-1; i++) {
			if(Character.isDigit(s1.charAt(i))){
				StringBuffer s3 = new StringBuffer();
				int j ;
				for (j=i ; Character.isDigit(s1.charAt(j)); j++) {
//					s3 +=s1.charAt(j);
					s3.append(s1.charAt(j));
					}
//				String s4 = revers(s3);
				s2+=s3.reverse();
				i=j-1;
				String s5 = s3.reverse().toString();
				System.out.println(s5);
			}
			else{
				s2+= s1.charAt(i);
				
			}
			
		}
	System.out.println(	Integer.hashCode(45));
		System.out.println(s2);
	}
	static String revers(String s){
		String s1 ="";
		for (int i = s.length()-1; i >= 0; i--) {
			s1+= s.charAt(i);
		}
		return s1;
	}

}
