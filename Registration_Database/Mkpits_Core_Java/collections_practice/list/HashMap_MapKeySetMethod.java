package com.mkpits.collections_practice.list;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;


public class HashMap_MapKeySetMethod {

	public static void main(String[] args) 
	{
		HashMap<Integer, String>studData=new HashMap<Integer, String>();
		Set<Integer>rollNo=new TreeSet<Integer>();
		studData.put(101, "Ashik");
		studData.put(185, "Pranav");
		studData.put(758, "Karan");
		studData.put(119, "Raj");
		
		System.out.println("Student Data---->"+studData);
		
		//Returns a Set view of the keys contained in this map
		rollNo=studData.keySet();
		
		System.out.println("Roll Number---->"+rollNo);
		
		

	}

}
