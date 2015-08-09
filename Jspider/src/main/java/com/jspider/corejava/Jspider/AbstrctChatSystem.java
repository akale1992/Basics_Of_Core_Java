package com.jspider.corejava.Jspider;

public abstract class AbstrctChatSystem {
	protected abstract  String getContents() throws InterruptedException ;
	
	protected abstract void putContents(String contents) throws InterruptedException ;
	
	public void gotContes(String contents) {
		System.out.println(contents);
	}

}
