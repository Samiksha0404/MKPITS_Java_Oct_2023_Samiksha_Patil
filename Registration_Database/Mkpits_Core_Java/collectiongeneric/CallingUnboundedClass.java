package com.mkpits.collectiongeneric;

public class CallingUnboundedClass {

	public static void main(String[] args) 
	{
		Integer[] serialnumber= {1,2,3,4,5,6,7,8,9,10};
		ArrayListUnbounded<Integer>obj=new ArrayListUnbounded();
		obj.print(serialnumber);
		System.out.println("\nStrudent Name----->");
		String[] studName= {"Ashik","Pranav","Raj","Sanket"};
		ArrayListUnbounded<String>obj1=new ArrayListUnbounded<String>();
		obj1.print(studName);
	}

}
