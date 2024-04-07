package com.mkpits.collectiongeneric;

import java.util.ArrayList;
import java.util.List;

public class Test2ArrayListGeneric {

	public static void main(String[] args) 
	{
		// generic version always gives type safety 
		List<Integer>rollNum=new ArrayList<>();
		rollNum.add(101);
		rollNum.add(102);
		rollNum.add(103);
		rollNum.add(104);
		rollNum.add(105);
//		rollNum.add("Ashik"); // its gives error because of type mismatch
//		rollNum.add(45.2);
//		rollNum.add('A');
		
		for (Integer values : rollNum) 
		{
			System.out.println("Roll Number--> "+values);
		}
		

	}

}
