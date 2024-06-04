package com.mkpits.collections_practice.list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class HashMap_Example1 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		HashMap<Integer, String>studentRecord=new HashMap<Integer, String>();
		System.out.println("How Many Data Want to Store--->");
		int dataCount=Integer.parseInt(br.readLine());
		System.out.println("Enter RollNo. and Name-->");
		for (int i = 0; i < dataCount; i++) 
		{
			studentRecord.put(Integer.parseInt(br.readLine()), br.readLine());
		}
		
		System.out.println("Student Data----->");
		//Returns a Set view of the mappings contained in this map.
		for (Map.Entry<Integer, String> entry : studentRecord.entrySet()) 
		{
			System.out.println("Roll No-->"+entry.getKey()+" Name-->"+entry.getValue());
		}
		
	}

}
