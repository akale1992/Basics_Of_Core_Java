package com.ashish;

import java.util.*;

public class CollectionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Students s1=new Students(101,"Sonoo",23);  
		  Students s2=new Students(102,"Ravi",21);  
		  Students s3 =new Students(103,"Hanumat",25);  
		      
		  ArrayList<Students> al=new ArrayList<Students>();//creating arraylist  
		  al.add(s1);//adding Student class object  
		  al.add(s2);  
		  al.add(s3);
		  System.out.println(al);
		    
		  Iterator itr=al.iterator();  
		  //traversing elements of ArrayList object  
		  while(itr.hasNext()){  
		    Students st=(Students)itr.next();  
		    System.out.println(st.rollno+" "+st.name+" "+st.age);  
		  }  
	}

}
class Students{
	  int rollno;
	  String name;
	  int age;
	  Students(int rollno,String name,int age){
	   this.rollno=rollno;
	   this.name=name;
	   this.age=age;
	  }
	}
