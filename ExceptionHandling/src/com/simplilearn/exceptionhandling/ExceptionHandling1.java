package com.simplilearn.exceptionhandling;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		
		try {
			int result=45/0;
		}catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e);
		}

	}

}
