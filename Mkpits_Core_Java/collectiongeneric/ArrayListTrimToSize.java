package com.mkpits.collectiongeneric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ArrayListTrimToSize {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		ArrayList<Integer>rollNo=new ArrayList<>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Number");
		for (int i = 0; i < 10; i++) 
		{
			// read values from user
			rollNo.add(Integer.parseInt(br.readLine()));
		}
		
		rollNo.add(520);
		//Trims the capacity of this ArrayList instance to be thelist's current size.
		rollNo.trimToSize();
		
		System.out.println(rollNo);
		
		

	}

}
