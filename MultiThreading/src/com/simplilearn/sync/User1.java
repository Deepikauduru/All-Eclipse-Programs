package com.simplilearn.sync;

public class User1 extends Thread{
	
	private String name;
	private String msg;
	private Sender sender;
	
	public User1(String msg, Sender sender) {
		
		this.name=name;
		this.msg=msg;
		this.sender=sender;
	}
	
	public void run() {
		
		synchronized (sender) {
		   sender.send(name,msg);
		}
	}


}
