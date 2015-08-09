package com.jspider.corejava.Jspider;

public class ChatSystemDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChatSystem chatSystem=ChatSystem.getInstance();
		PersonA personA=new PersonA(chatSystem);
		Thread t1=new Thread(personA);
		PersonB personB=new PersonB(chatSystem);
		Thread t2=new Thread(personB);
		t1.start();
		t2.start();
	}

}
