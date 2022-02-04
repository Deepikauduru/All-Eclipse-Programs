package com.simplilearn.exceptionhandling;

public class TestCustomeException {
	
	void check(int age)throws NotValidAgeException{
		
		if(age<18)
			throw new  NotValidAgeException("Age is less than 18");
		else
			System.out.println("valid");
	}
	public static void main(String[] args) throws NotValidAgeException{
		
		TestCustomeException t=new TestCustomeException();
		t.check(67);
	}
	

}
