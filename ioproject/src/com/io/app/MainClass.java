package com.io.app;

class A {
	static void staticMethod() {
		System.out.println("Static Method");
	}
	void selection (){
		int [] arr ={10,30,25,35,20};
		
		for (int i = 0; i < arr.length-1; i++) {
			int smallindex = i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[smallindex]>arr[j]) {
					smallindex=j;
					
				}
				int temp = arr[i];
				arr[i] = arr[smallindex];
				arr[smallindex]=temp;
			} 
			
		}
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
	void stringFunction(){
		String s1= "Ashish";
		String s2 = "";
		for (int i = 0; i < s1.length(); i++) {
			if (s1.indexOf(s1.charAt(i))==i) {
				
				s2+=s1.charAt(i);
				
			}
			
			
		}
		System.out.println("new string  "+s2);
		
		
	}
	

   void bubble(){
	   int [] arr ={10,15,35,30,20,25};
	   for (int i = 1; i < arr.length; i++) {
		for (int j = 0; j < arr.length-1; j++) {
			if (arr[j]>arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1]= temp;
				
			}
			
		}
	}
	   for (int i : arr) {
		   System.out.println();
		   System.out.print(i+" ");
		
	}
   }
}

public class MainClass {
	public static void main(String[] args) {
		A a = null;

//		a.staticMethod();
		
		a=new A();
//		a.methodOfA();
//		a.selection();
//		a.bubble();
		
		a.stringFunction();
	}
	
	
	
}
