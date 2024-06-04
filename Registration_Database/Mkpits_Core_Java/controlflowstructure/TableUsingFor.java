package com.mkpits.controlflowstructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TableUsingFor {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Your Number :");
		int number=Integer.parseInt(read.readLine());
		int num=10;
		for(int i=1;i<=num;i++)
		{
			System.out.println(i+"*"+number+"="+(i*number));
		}

	}

}
