package com.jlc;

public class Lab5 extends Thread{
	public Lab5() {
		// TODO Auto-generated constructor stub
		super("ashish");
		start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(this);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab5 l = new Lab5();
		int n=5;
		char ch='A';
		for(int r=0;r<n;r++){
		for(int i=0;i<n-r;i++){
			System.out.print("  ");
		}
		for(int c=0;c<=r;c++){
			System.out.print(ch+" ");
		}
		System.out.println();
		ch++;
		}	

	}

}

