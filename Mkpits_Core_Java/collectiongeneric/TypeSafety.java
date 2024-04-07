package com.mkpits.collectiongeneric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TypeSafety {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Integer[] numbers=new Integer[5];
//		System.out.println("Enter Even Number-->");
//		for (int i = 0; i < numbers.length; i++) 
//		{
//			numbers[i]=Integer.parseInt(br.readLine());
//		}
//
//		System.out.println("Your Names-->");
//		for (Integer evenNo : numbers) {
//			System.out.println(evenNo);
//		}
		
		numbers[0]=2;
		numbers[2]=4;
		numbers[3]=8;
	//	numbers[2]="Ashik"; // this line gives me error due to type of accepting data 
		
		Integer num=456;
		// instanceOf variable check the data are in given datatype
		System.out.println("Instance of num is integer or not : "+(num instanceof Integer));
		
	}

}
