package com.simplilearn.thread;

public class MultiThreadingDemo extends Thread{
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			
			try {
				Thread.currentThread().sleep(1000);
			}catch (Exception e) {
				e.printStackTrace();
			}System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}

	public static void main(String[] args) {
		MultiThreadingDemo t1=new MultiThreadingDemo();
		MultiThreadingDemo t2=new MultiThreadingDemo();
		MultiThreadingDemo t3=new MultiThreadingDemo();
		
		t1.start();
		t2.start();
		t3.start();
		
//	one thread not waiting for the another in o/p	

	}

}
