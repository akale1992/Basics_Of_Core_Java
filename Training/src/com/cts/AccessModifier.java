package com.cts;

class SubClass extends Overloading{
	public void instanceMethod(int i,int j) {
		System.out.println("From superclass instancemethod");
		
	}
}
public class AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=1;
		short s=0;
		DataType dataType = new DataType(b,s,123,12L,12.12f,12.123d,true,'c');
		
		dataType.c='A';//default
		dataType.d=0.12;//protected
		System.out.println(dataType.d);
		boolean a=dataType.getBool();//private
		System.out.println(a);
		dataType.setBool(false);
		a=dataType.getBool();//private
		
		System.out.println(a);
	}

}
