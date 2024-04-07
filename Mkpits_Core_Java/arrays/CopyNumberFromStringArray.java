package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class CopyNumberFromStringArray {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[]num=new String[5];
		System.out.println("Enter String number");
		for (int i = 0; i < num.length; i++) 
		{
			num[i]=br.readLine();
			
		}
		
		
		int number[]=new int[num.length];
		for (int i = 0; i < num.length; i++) 
		{
			number[i]=Integer.parseInt(num[i]);
			
		}
		
		System.out.println("Integer Number");
		for (int i : number) {
			System.out.println(i);
		}
	}

}
