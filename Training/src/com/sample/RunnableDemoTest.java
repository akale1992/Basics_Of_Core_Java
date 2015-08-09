package com.sample;

class RunnableThread implements Runnable{
	private Thread t;
	public RunnableThread(String name,int newPriority) {
		this.t=new Thread(this,name);
		t.setPriority(newPriority);
		// TODO Auto-generated constructor stub
	}
	
	public void start() {
		t.start();
		
	}
	@Override
	public void run(){
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println(t.getName()+" "+i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(t.getName()+" Exiting");
	}
}


public class RunnableDemoTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableThread r1= new RunnableThread("Thread-1",Thread.MAX_PRIORITY);
		r1.start();
		
		RunnableThread r2= new RunnableThread("Thread-2",1);
		r2.start();
		
		RunnableThread r3= new RunnableThread("Thread-3",1);
		r3.start();
	}

}
