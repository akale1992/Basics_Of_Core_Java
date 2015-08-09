package com.sample;

public class MyThred implements Runnable {
	Hello h;
	public MyThred(Hello h) {
		// TODO Auto-generated constructor stub
		this.h = h ;
	}
	
		
	
@Override
public void run() {
	// TODO Auto-generated method stub
	
    h.show();
}
}
