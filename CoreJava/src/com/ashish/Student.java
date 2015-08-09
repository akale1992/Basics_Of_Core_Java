package com.ashish;

public class Student {
	 int id;  
	    String name;  
	    Student (){System.out.println("default constructor is invoked");}  
	      
	    Student(int id,String name){ 
	    this();	
	    id = id;  
	    name = name;  
	   // this ();//must be the first statement  
	    }  
	    void display(){System.out.println(id+" "+name);}  
	      
	    public static void main(String args[]){  
	    Student e1 = new Student(111,"karan");  
	    Student e2 = new Student(222,"Aryan"); 
	    e1.display();  
	    e2.display();  
	   }  

}
