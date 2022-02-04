package com.simplilearn.exceptionhandling;

public class NotValidAgeException  extends Exception{
	
	public NotValidAgeException(String msg) {
		//super keyword pass msg from child to parent constructor
		super(msg);
	}

	public static void main(String[] args) {
		
	}

}
