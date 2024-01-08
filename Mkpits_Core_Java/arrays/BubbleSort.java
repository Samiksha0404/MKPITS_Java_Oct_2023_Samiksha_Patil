package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int temp;
	BufferedReader	br = new BufferedReader(new InputStreamReader(System.in));
	 System.out.println("Enter the 5 number");
	    int  []  num = new int[5];
			for(int i = 0;i<num.length;i++) {
				 num [i]= Integer.parseInt(br.readLine());
				
	}
			for(int i=0;i<num.length;i++)
			{
				for(int j=i+1;j<num.length;j++) {
					
					if(num[i]>num[j]) {
						temp =num[i];
						num[i]=num[j];
						num[j]= temp;
						//System.out.println(num[j]);
						}
				}
			}
			
			System.out.println("sorted array");
			
			for (int i = 0; i < num.length; i++) 
			{
				System.out.println(num[i]);
			}
 

}
}
