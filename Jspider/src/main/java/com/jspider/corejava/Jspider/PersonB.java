package com.jspider.corejava.Jspider;

import java.util.Scanner;

public class PersonB implements Runnable {
	private ChatSystem chatSystem ;

	public PersonB(ChatSystem chatSystem) {
		// TODO Auto-generated constructor stub
		this.chatSystem=chatSystem;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	
	for (int i = 0; i < 10; i++) {
		try {
			chatSystem.getContents();
			Thread.sleep((int)(Math.random() * 100));
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter text for person b");
//			String contents = sc.next();
//			chatSystem.putContents(contents);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}

}
