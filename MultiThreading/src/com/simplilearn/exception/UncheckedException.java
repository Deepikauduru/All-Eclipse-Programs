package com.simplilearn.exception;

import java.util.Scanner;

public class UncheckedException {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two num");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int div;
		
		div=n1/n2;
		System.out.println(+div);

	}

}
