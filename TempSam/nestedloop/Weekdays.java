package com.mkpits.nestedloop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Weekdays {

	

		public static void main(String[] args) throws NumberFormatException, IOException {
			// TODO Auto-generated method stub
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 // System.out.println("enter the number for stars:");
	// int num = Integer.parseInt(br.readLine());
	  int day=7;
	  int week=3;
	     for(int i=1;i<=week;i++) {
	    	 System.out.println(" Week"+i);
	 	
	     
		 for(int j=1;j<=day;j++) {
			 System.out.println(" Day"+j);
		 }
		

		}
}
}