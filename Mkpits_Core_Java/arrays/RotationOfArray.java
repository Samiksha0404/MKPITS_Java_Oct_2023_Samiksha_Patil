package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// Requirement - Rotate Your Array 
// Design - Taking array from user and sized of the array and rotation from user
// Development- using for loop for reading array from user and used nested for loop to swap the element  
// output - input= [1,2,3,4,5] , rotation =3 , final output =[5,4,3,1,2]
public class RotationOfArray 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Size");
		byte size=Byte.parseByte(br.readLine());
		int array[]=new int[size];
		System.out.println("Enter The Array Num");
		for (int index = 0; index < array.length; index++) 
		{
			array[index]=Integer.parseInt(br.readLine());
		}
		System.out.println("Original Array :"+Arrays.toString(array));
		
		System.out.println("\nEnter the rotation");
		byte rotation=Byte.parseByte(br.readLine());
		
		for (int outerLoop = 0; outerLoop < rotation; outerLoop++) 
		{
			int lastNum=array[array.length-1];
			for (int innerLoop = array.length-1; innerLoop >0 ; innerLoop--) 
			{
				array[innerLoop]=array[innerLoop-1];
			}
			array[0]=lastNum;
		}
		
		System.out.println("Rotate Array :"+Arrays.toString(array));
	}

}