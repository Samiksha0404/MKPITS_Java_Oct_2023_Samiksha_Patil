package com.mkpits.collection;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDataAddIntoFile {

	public static void main(String[] args) throws IOException 
	{
		List<String> name=new ArrayList<>();
		name.add("Raj");
		name.add("Kundra");
		
		
		BufferedWriter br=new BufferedWriter(new FileWriter("F:\\Name.txt"));
		
		for (String string : name) {
			
			br.write(string);
			System.out.println(string);
		}
		
		
		System.out.println("Files Has Been Created And data Is added");
		
		

	}
	
	

}
