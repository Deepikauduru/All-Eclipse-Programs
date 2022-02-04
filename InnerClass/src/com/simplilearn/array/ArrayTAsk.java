package com.simplilearn.array;

import java.util.Scanner;

public class ArrayTAsk {

	public static void main(String[] args) {
		
		int a[][]= new int[2][2];
		int b[][]=new int[2][2];
		int sum[][]=new int[2][2];
		
		Scanner sc=new Scanner(System.in);
		
		//first elements
		System.out.println("Enter the elements of a");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++) {
			a[i][j]=sc.nextInt();
			}		
		}
		
		//second elements
		System.out.println("Enter the elements of b");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		
		//addition
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				sum[i][j]=a[i][j]+b[i][j];
			}
			
		}
		
		//display
		System.out.println("sum of a and b:");
		for(int i=0;i<a.length;i++) {
        for(int j=0;j<b.length;j++) {
        System.out.printf(sum[i][j] +"\t");		
			}			
		}
		System.out.println();
			

	}

}
