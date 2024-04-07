package com.mkpits.arrays;

public class SortingArray {

	public static void main(String[] args) 
	{
		int [] array= {10,25,9,45,11,45};
		int largest=0, secondLarg=0;
		
		for (int index = 0; index < array.length; index++) 
		{
			if(largest>=array[index])
				largest=largest;
			else
				largest=array[index];
		
		}
		System.out.println(largest);
	}

}
