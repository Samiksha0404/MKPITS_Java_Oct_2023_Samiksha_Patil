package com.mkpits.genericcollection;

// generic class
public class PrintDataClass<A> 
{
	// method for print data
	public void printData(A[] array)
	{
		// for each loop
		for (A a : array) 
		{
			System.out.print(a+" ");
		}
	}
}
