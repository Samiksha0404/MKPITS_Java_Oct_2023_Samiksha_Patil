package com.mkpits.genericcollection;

public class BoundedTypeClass {

	public static void main(String[] args) 
	{
		// wrapper class array
		Double[] doubleValue= {45.22,458.45,78.20,78.15,45.00};
		ArrayasSum<Double> sum=new ArrayasSum<Double>(); // creating object
		sum.addArray(doubleValue); // calling method 

	}

}
