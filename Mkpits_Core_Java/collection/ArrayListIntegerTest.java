package com.mkpits.collection;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIntegerTest {

	static BufferedReader reader;
	static List<Integer> list=new ArrayList<Integer>();
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Number  to Add the data");
		int size=Integer.parseInt(reader.readLine());
		
		putNumber(size); // static method call to add number in list
		
		showNumber(); // static method call to itrate num from list
		

	}
	
	// method to put data
	static void putNumber(int size)
	{
		for(int index=0;index<size;index++)
		{
			System.out.println("Enter "+(index+1)+"st value");
			int num=0;
			try {
				num = Integer.parseInt(reader.readLine());
			} catch (NumberFormatException | IOException e) {
				
				e.printStackTrace();
			}
			list.add(num);
			
		}
	}

	// method to show data
	static void showNumber()
	{
		for (Integer integer : list) 
		{
			System.out.println(integer);
			
		}
	}
}
