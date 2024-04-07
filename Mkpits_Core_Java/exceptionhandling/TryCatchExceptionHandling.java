package com.mkpits.exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryCatchExceptionHandling {

	public static void main(String[] args) {
		int []arr=new int[5];
		int value1=100, value2=0;
		// try block  used to write code
		try
		{
			System.out.println(arr[5]);
		}
		// catch block 
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		 try
		 {
			 System.out.println(value1/value2);
		 }
		 catch (Exception e) 
		 {
			e.printStackTrace();
		 }
		 
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enyter Your Name");
		 try 
		 {
			String name=br.readLine();
		 } 
		 catch (IOException e) 
		 {
			e.printStackTrace();
		 }

	}

}
