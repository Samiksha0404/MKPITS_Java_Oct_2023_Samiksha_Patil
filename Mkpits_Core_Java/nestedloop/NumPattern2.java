package com.mkpits.nestedloop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumPattern2 {
	
	
		

		
			public static void main(String[] args) throws NumberFormatException, IOException {
			// TODO Auto-generated method stub
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  System.out.println("enter the number for stars:");
		 int num = Integer.parseInt(br.readLine());
		     for(int i=num;i>=1;i--) {
		    	 for(int k=i;k<=num;k++) {
					 System.out.print(" ");
				 }
			 for(int j=i;j>=1;j--) {
			 System.out.print(j);
			 }
			
			 
			 
		     System.out.println();
			}
			
		     
		}

}		

		




