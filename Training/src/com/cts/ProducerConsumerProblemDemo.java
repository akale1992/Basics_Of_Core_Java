package com.cts;

 class Hello {
	private int value;
	private boolean available = false;

	public synchronized int getValue() throws InterruptedException {
	    if(available == false){
	    	wait();
	    }
	    
	    available = false;
	    notifyAll();
		return value;
	}

	public synchronized void setValue(int value) {
		if(available == true){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		available = true;
		this.value = value;
		System.out.println("Setting "+ value);
		notifyAll();
	}

}
 public class ProducerConsumerProblemDemo{
	public static  void main(String[] args) {
		Hello h = new Hello();
		Producer p1 = new Producer(h);
		Consumer c1 =new Consumer(h);
		p1.start();
		c1.start();
	}
}
class Producer extends Thread{
	Hello h = null;
	public Producer(Hello h) {
		// TODO Auto-generated constructor stub
		this.h=h;
	}
	
	@Override
	
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			h.setValue(i);
			
//			try {
//				//Thread.sleep(50);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
}
class Consumer extends Thread{
	Hello h = null;
	public Consumer(Hello h) {
		// TODO Auto-generated constructor stub
		this.h=h;
	}
	
	@Override
	
	public void run() {
		// TODO Auto-generated method stub
		try {for (int i = 0; i < 5; i++) {
			//.Thread.sleep(1);
			int val=h.getValue();
			Thread th = Thread.currentThread();
			System.out.println(th.getName()+"  is getting  "+val);
		}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}