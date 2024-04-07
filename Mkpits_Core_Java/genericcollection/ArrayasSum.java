package com.mkpits.genericcollection;

public class ArrayasSum<ArrDatatype extends Number> 
{
	public void addArray(ArrDatatype[] array)
	{
		// local variable
		double sum=0;
		// for each loop used to etrate values from array
		for (ArrDatatype arr : array) 
		{
			System.out.println((sum=sum+arr.doubleValue())); // adding all index value
		}
		System.out.println("Total:- "+sum);
	}
}
