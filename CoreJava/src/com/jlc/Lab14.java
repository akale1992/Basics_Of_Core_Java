package com.jlc;

import java.io.IOException;

public class Lab14{

	static void validate(int age) throws IOException {
	   
	  if(age<18)
	      throw new IOException("not valid");
	     else
	      System.out.println("welcome to vote");
	
	   }
	   
	   public static void main(String args[]){
		  
			   try {
				validate(13);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	      
	      System.out.println("rest of the code...");
	  }
	}
