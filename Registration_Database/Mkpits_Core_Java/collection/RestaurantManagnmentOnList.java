package com.mkpits.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class RestaurantManagnmentOnList {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> foodItems=new ArrayList<String>();
		foodItems.add("Panner Roll");
		foodItems.add("Chicken");
		foodItems.add("Noodles");
		foodItems.add("Pulao");
		foodItems.add("Pizza");
		foodItems.add("Burger");
		
		
		
		System.out.println("How Many People Are There--->");
		int totalPeople=Integer.parseInt(br.readLine());
		ArrayList<String>customerName=new ArrayList<String>();
		System.out.println("Peoples Names--->");
		for (int i = 0; i < totalPeople; i++) 
		{
			customerName.add(br.readLine());
		}
		
		//System.out.println("Customer Names -->"+customerName);

		
		System.out.println("Available Food Items Are--->");
		for (String string : foodItems) 
		{
			System.out.println(string);
		}
		for (int i = 0; i < customerName.size(); i++) 
		{
			List<String>items=new ArrayList<String>();
			System.out.println("Order for "+customerName.get(i));
//			for (int j = 0; j < foodItems.size(); j++) 
//			{
//				System.out.println("Enter your choice..");
//				String choice=br.readLine();
//				if(foodItems.get(j).equalsIgnoreCase(choice))
//				{
//					items.add(choice);
//					continue;
//				}
			
			while(true)
			{
				System.out.println("Enter your choice");
				String choice=br.readLine();
				if(choice.equalsIgnoreCase("End"))
				{
					break;
				}
				items.add(choice);
			}
			System.out.println(customerName.get(i)+" orderd---> "+items);
			
			
		}

	}

}
