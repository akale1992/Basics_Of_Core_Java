package com.ashish;
import java.io.Serializable;
import java.util.*;
public class CollectionTest2 extends A implements Runnable  {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Students s1=new Students(101,"Sonoo",23);  
		  Students s2=new Students(102,"Ravi",21);  
		  Students s3 =new Students(103,"Hanumat",25);
	
		TreeSet al=new TreeSet();  
		  al.add(new String("Ravi"));  
		  al.add(s1);  
		  al.add(s2);  
		  al.add(s3);  
		  System.out.println(al);
		  System.out.println(al.toString());
		  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
	}
	public void run (){}

}
