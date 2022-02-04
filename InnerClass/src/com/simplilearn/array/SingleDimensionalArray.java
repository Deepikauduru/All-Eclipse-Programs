package com.simplilearn.array;

import java.util.Scanner;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		
		int array[]= {1,2,3,4,5,5};
		System.out.println("access elements:" +array[3]);
		
		//print all elements
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
			
		}
		//another way of array declaration always use loop
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			System.out.println("enter your roll no");
			a[i]=sc.nextInt();
			
		}
		//print all scanned elements always use loop
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
