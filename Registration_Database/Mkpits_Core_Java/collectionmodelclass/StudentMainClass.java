package com.mkpits.collectionmodelclass;

import java.util.ArrayList;

public class StudentMainClass {

	public static void main(String[] args) {
		
		// creating array list object
		ArrayList<StudentModelClass> obj=new ArrayList<StudentModelClass>();
		// addding value though constructor
		obj.add(new StudentModelClass(101, "Ashik", "Nagpur", 45000.54));
		obj.add(new StudentModelClass(102, "Ruggu", "Kondali", 45001.54));
		obj.add(new StudentModelClass(103, "Raj", "Mankapur", 45010.54));
		
		
		ArrayList<StudentModelClass> obj1=new ArrayList<StudentModelClass>();
		obj1.add(new StudentModelClass(101, "Ashik", "Nagpur", 45000.54));
		obj1.add(new StudentModelClass(104, "Karan", "Amravati", 45201.54));
		obj1.add(new StudentModelClass(105, "Pranav", "Itwari", 45110.54));
		System.out.println("List 1 ----------------------------------------->");
		for (StudentModelClass student : obj1) 
		{
			System.out.println(student);
		}
		System.out.println("List 2 --------------------------------------------->");
		for (StudentModelClass student : obj1) 
		{
			System.out.println(student);
		}
		
		System.out.println("Adding list2 into list 2--------------------->");
		obj.addAll(obj1);
		
		for (StudentModelClass student : obj) 
		{
			System.out.println(student);
		}
		
		System.out.println("Remove list2 from 1------------------------------->");
		obj.removeAll(obj1);
		for (StudentModelClass student : obj1) 
		{
			System.out.println(student);
		}
		
		System.out.println("Retain list 2------->");
		obj.retainAll(obj1);
		//obj.removeAll(obj1);
		for (StudentModelClass student : obj1) 
		{
			System.out.println(student);
		}
		
		
		

	}

}
