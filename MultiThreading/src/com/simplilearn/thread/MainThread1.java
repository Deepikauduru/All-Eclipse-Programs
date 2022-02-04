package com.simplilearn.thread;

public class MainThread1 {
	public class MainThread implements Runnable{
		
		public static int count=0;
		
		public MainThread() {
			
		}
		
		public void run() {
			while(count<=10) {
				System.out.println("Exc Thread"+ (++count));
				try {
					Thread.sleep(1000);
				}
					catch (Exception e) {
						e.printStackTrace();
				}
			}
		}
		

	public static void main(String[] args) {
	
			System.out.println("Starting main threAD..");
			
			MainThread main=new MainThread();
			Thread m=new Thread(main);
			m.start();
			
			while(count<=10) {
				System.out.println("Main Thread"+ (++count));
				try {
					Thread.sleep(1000);
				}
					catch (Exception e) {
						e.printStackTrace();
				}
			}
			
		}
			

		}



	}


