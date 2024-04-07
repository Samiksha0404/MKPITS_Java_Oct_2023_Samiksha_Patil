package com.mkpits.controlflowstructure;

public class StarUsingFor {

	public static void main(String[] args) {
		
		// triangle pattern problem 
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		System.out.println();

		// odd triangle pattern
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2!=0)
					System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Pyramid Triengle");
		// symmetric pyramid pattern
		for(int i=1;i<=5;i++)
		{
			for(int k=i;k<5;k++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("  * ");
			}
			System.out.println();
		}
	}

}
