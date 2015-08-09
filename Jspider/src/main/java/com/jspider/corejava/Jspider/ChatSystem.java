package com.jspider.corejava.Jspider;

public class ChatSystem extends AbstrctChatSystem {

	private boolean flag = false;
	private String contents;
	private static ChatSystem chatSystem = null;

	private ChatSystem() {
		// TODO Auto-generated constructor stub
	}

	public static ChatSystem getInstance() {
		if (chatSystem == null) {


				if (chatSystem == null) {
					chatSystem = new ChatSystem();
				
			}

		}
		return chatSystem;

	}

	@Override
	public synchronized String getContents() throws InterruptedException {
		if (flag == false) {
			System.out.println("going to wait state get");
			wait();
		}
		notifyAll();
		flag = true;
		
		
		String contents=this.contents;
		gotContes("Got Contents"+contents);
		return contents;
	}

	@Override
	public synchronized void putContents(String contents)
			throws InterruptedException {
		if (flag == true) {
			System.out.println("going to wait state put");
			wait();
		}
		
		
		this.contents = contents;
		gotContes("Putting Contents"+contents);
		flag = false;
		notifyAll();
	}

}
