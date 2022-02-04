package Assignments;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		int num1,num2;
		int ans=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num1 value: ");
		num1=sc.nextInt();
		System.out.println("Enter the num2 value: ");
		num2=sc.nextInt();
		System.out.println("+,-,*,/");
		String operator =sc.next();
		
		switch(operator) {
		
		case "+": ans=num1+num2;
		System.out.println("Addition:" +ans);
		break;
		
		case "-": ans=num1-num2;
		System.out.println("Subtraction:" +ans);
		break;
		
		case "*": ans=num1*num2;
		System.out.println("Multiplication:" +ans);
		break;
		
		case "/": ans=num1/num2;
		System.out.println("Division:" +ans);
		break;
		
		default:
			System.out.println("Invalid operator");
			break;
		}
		
		System.out.println();

	}

}
