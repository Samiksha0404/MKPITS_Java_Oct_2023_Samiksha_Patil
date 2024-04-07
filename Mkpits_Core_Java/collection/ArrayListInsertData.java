package com.mkpits.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ArrayListInsertData {

	static BufferedReader br;
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		List<String>colors=new ArrayList<String>();
		br=new BufferedReader(new InputStreamReader(System.in));
		enterArrayList(colors);
		System.out.println("List Of Colors..\n");
		for (String string : colors) 
		{
			System.out.println(string);
		}
		System.out.println("Enter Position ");
		int position=Integer.parseInt(br.readLine());
		insertArrayList(colors,position);
		
		for (String string : colors) 
		{
			System.out.println(string);
		}
	}

	private static void insertArrayList(List<String> colors, int position) throws IOException 
	{
		System.out.println("Enter New Element");
		colors.add(position-1,br.readLine() );
		
	}

	private static void enterArrayList(List<String> colors) throws NumberFormatException, IOException 
	{
		System.out.println("Enter Length");
		int len=Integer.parseInt(br.readLine());
		System.out.println("Enter the Colors Name");
		for (int i = 0; i < len; i++) 
		{
			colors.add(br.readLine());
		}
		
	}

}
