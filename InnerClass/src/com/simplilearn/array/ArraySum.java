package com.simplilearn.array;

import java.util.Scanner;

public class ArraySum {
//int a; int b;
//int sum=0;
//sum=a+b;
	
	public static void main(String[] args) {
		
		int[][] a=new int[2][2];
		int[][] b=new int[2][2];
		int[][] sum=new int[2][2];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Elements of a:");
		for(int i=0;i<a.length;i++) {			
			for(int j=0;j<b.length;j++) {
				a[i][j]=sc.nextInt();		
				
			}
		}
		System.out.println("Enter the Elements of b:");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Sum of the Elements:");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				System.out.println(sum[i][j]);
		
			}
		}
		
	System.out.println();	

	}

}
