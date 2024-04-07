package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiDimentionalArrays {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter your rows :");
		byte row=Byte.parseByte(br.readLine());
		System.out.print("Enter your columns :");
		byte col=Byte.parseByte(br.readLine());
		
		// arrays declaration 
		int array[][]=new int[row][col];
		
		// read the arrays element 
		System.out.println("Enter Your Values :");
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = 0; j < col; j++) 
			{
				array[i][j]=Integer.parseInt(br.readLine());
			}
		}
		
		// fetch element from arrays
		System.out.println("The Values are :");
		for (int i = 0; i < row; i++) 
		{
			for (int j = 0; j < col; j++) 
			{
				System.out.print(array[i][j]+" | ");
			}
			System.out.println();
		}

	}

}
