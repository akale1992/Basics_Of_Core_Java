package com.jspider.corejava.Jspider;

import java.util.Scanner;

public class PersonA implements Runnable{
	private ChatSystem chatSystem;
	public PersonA(ChatSystem chatSystem) {
		// TODO Auto-generated constructor stub
		
		this.chatSystem=chatSystem;
		}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter text for person a");
//			String contents = sc.next();
			try {
				chatSystem.putContents(i+"");
				Thread.sleep((int)(Math.random() * 100));
//				chatSystem.getContents();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
