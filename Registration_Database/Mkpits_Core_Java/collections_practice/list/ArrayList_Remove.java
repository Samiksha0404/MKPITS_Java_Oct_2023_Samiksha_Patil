package com.mkpits.collections_practice.list;

import java.util.ArrayList;

public class ArrayList_Remove {

	public static void main(String[] args) {
		
		ArrayList<Integer>number=new ArrayList<Integer>();
		number.add(10);
		number.add(11);
		number.add(70);
		number.add(1102);
		number.add(9);
		number.add(20);
		
		System.out.println("Original Value----->"+number);
		for (int i = 0; i < number.size(); i++) 
		{
			int num=number.get(i);
			if(num%2==0)
			{
				System.out.println("Number is Even------>"+num);
			}else
				number.remove(number.get(i));
		}
		
		System.out.println("Even Number Values-------->"+number);

	}

}
