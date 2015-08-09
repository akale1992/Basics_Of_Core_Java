package com.sample;
class MyThread extends Thread{
	
	

	@Override
	public void run() {
		super.run();
		for (int i = 0; i < 5; i++) {
			System.out.println(i+ " "+this.getName());
			
		}
//		try {
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
		
	
}

public class ThreadTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t2.setPriority(10);
        t1.start();
        try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        t2.start();
	}

}
