package com.mkpits.arrays;

public class StringValueToIntArray {

	public static void main(String[] args) 
	{
		String num="12345";
		int arr[]=new int[num.length()];
		
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=(num.charAt(i))-48;
		}
		
		for (int i : arr) {
			System.out.println(i);
		}

	}

}
