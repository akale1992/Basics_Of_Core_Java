package com.sample;

public class Hello {
	 void show() {
		for (int i = 0; i < 5; i++) {
			Thread th = Thread.currentThread();
			try {
//				wait(1000);
				Thread.sleep(1000);
				System.out.println(i+" "+th.getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(th.getName()+" "+th.getId()+" "+th.getPriority());
            System.out.println(th.getState());
		}
	}
}
	
