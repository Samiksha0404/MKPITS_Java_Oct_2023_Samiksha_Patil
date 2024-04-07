package com.mkpits.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class SetRemoveMethod {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Set<String>names=new HashSet<String>();
		names.add("Ashu");
		names.add("Pranav");
		names.add("Hurshal");
		names.add("Karan");
		names.add("Raju");
		System.out.println("Names ---> ");
		names.forEach(System.out::println);

		System.out.println("Enter Name --->");
		String name=br.readLine();
		for (int i = 0; i < names.size(); i++) 
		{
			if(names.contains(name))
			{
				names.remove(name);
				System.out.println(name+" has been Removed from Set....");
				break;
			}
		}
		
		System.out.println("Updated Names ------>");
		names.forEach(System.out::println);

	}

}
