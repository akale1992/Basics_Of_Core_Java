package com.jlc.test;


	class TestSleepMethod1 extends Thread{  
		 public void run(){  
			 CheckNumber ch = new CheckNumber();
			 ch.fibonaci(2);
			 
		  for(int i=1;i<5;i++){  
//		    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
			
		    System.out.println(i);
		    Thread th = Thread.currentThread();
		    System.out.println(th.getName());
		    
		  }  
		 }  
		 public static void main(String args[]){  
		  TestSleepMethod1 t1=new TestSleepMethod1();  
		  TestSleepMethod1 t2=new TestSleepMethod1();  
		   
		  t1.start();
		  t1.setName("Ashish");
		  t2.start();
		  t2.setName("Mangesh");
		 
		 }  
		}  


