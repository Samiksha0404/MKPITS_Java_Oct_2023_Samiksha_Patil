package com.mkpits.exceptionhandling;

import java.io.IOException;

public class MultipleCatchEceptionHAndling {

	public static void main(String[] args) 
	{
		String arrayName[]= {"Ashik","Pranav","Raju","Kamla","Vimla"};
		try 
		{
		System.out.println(arrayName[5]);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
	}

}
