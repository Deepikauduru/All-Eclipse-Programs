package com.simplilearn.sync;

public class Sender {
	
	public void send(String msg) {
		System.out.println("Sending" +msg);
		try {
			Thread.sleep(1000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	syso

}
