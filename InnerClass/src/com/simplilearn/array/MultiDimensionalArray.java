package com.simplilearn.array;

import java.util.Scanner;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//storing 3/3 elements using array
		
		//lets store elements in a matrix
		int array[][]=new int[3][3];
		for(int row=0;row<3;row++)//outer loop means row starts from 0
		{
			for(int col=0;col<3;col++)//inner loop col starts from 0 
			{
				System.out.println("Enter Element");
				array[row][col]=sc.nextInt();
			}
		}
		System.out.println("lets print elements");
		for(int row=0;row<3;row++) {
			for(int col=0;col<3;col++) {
				System.out.print(array[row][col]+"\t");
			}
			System.out.println();
			
		}

	}

}
