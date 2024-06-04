package com.mkpits.genericcollection;

public class ClassArrays {

	public static void main(String[] args) 
	{
		System.out.println("Integer Array Data");
		Integer[] integersNum= {101,120,256,458,7895,450,12}; // wrapper class array
		PrintDataClass<Integer>printData=new PrintDataClass<>(); // creating object
		printData.printData(integersNum);// calling printData method
		
		System.out.println("\nNames Array Data");
		String[] names= {"Ashik","Raju","Shimla","Pranav","Sanku","Vaibhav","Samiksha1","Samiksha2","Vinya"};
		PrintDataClass<String>print=new PrintDataClass<String>();
		print.printData(names);
	}

}
