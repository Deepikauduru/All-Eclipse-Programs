package com.simplilearn.annonymousinner;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		
		String s=new String("Hello World");
		
		System.out.println("length"+s.length());
		System.out.println("character at index 3:" +s.charAt(3));
		System.out.println(s.startsWith("Hello"));
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your password");
		String pwd=sc.nextLine();
		if(s.equalsIgnoreCase(pwd)) {//if we equals ignore case it will take both upper&lower case letters if EQUALS then it will include upper&lower case letters
			System.out.println("authenticated");
		}
			else {
				System.out.println("Incorrect password");
			
		}
		    String str="       Hello          ";
	        System.out.println(str.length());
	        System.out.println(str.stripLeading().length());
	        System.out.println(str.stripTrailing().length());

	}

}
