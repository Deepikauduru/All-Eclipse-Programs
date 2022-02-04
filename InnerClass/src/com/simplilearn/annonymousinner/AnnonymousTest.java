package com.simplilearn.annonymousinner;

public class AnnonymousTest {

	public static void main(String[] args) {
		Car c=new Car() {
			public void start() {
				System.out.println("");
			}
			public void stop() {
				System.out.println("");
			}
			
		}
		c.start();
		c.stop();
	

	}

}
