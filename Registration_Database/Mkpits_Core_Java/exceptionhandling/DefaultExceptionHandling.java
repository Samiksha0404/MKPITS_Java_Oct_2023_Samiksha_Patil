package com.mkpits.exceptionhandling;

public class DefaultExceptionHandling {

	public static void main(String[] args) {
		int []arr=new int[5]; 
		// jre throws expection 
		System.out.println(arr[5]); // Index 5 out of bounds for length 5 
	}

}
