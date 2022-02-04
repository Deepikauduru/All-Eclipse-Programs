package com.simplilearn.exceptionhandling;

public class ThrowDemo {
	
	void check(int age) {
		if(age<18)
			throw new ArithmeticException("Age is not valid for vote");
		else
			System.out.println("valid");
	}

	public static void main(String[] args) {
		ThrowDemo t=new ThrowDemo();
		//handle exception try catch
		
		try {
			t.check(10);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
