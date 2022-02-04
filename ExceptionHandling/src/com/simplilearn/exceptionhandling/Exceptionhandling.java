package com.simplilearn.exceptionhandling;

public class Exceptionhandling {

	public static void main(String[] args) {
		int sum=0;
		for(int i=0;i<args.length;i++)
		{
			try {
			sum=sum+ Integer.parseInt(args[i]);
			}
			catch(NumberFormatException e)
			{
				System.out.println("Error occured"+args[i]+"can not format to Integer");
				e.printStackTrace();
			}
		}
		System.out.println("sum is:"+sum);

	}

}
