package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
     
     static int fact=1;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
	 BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
     System.out.println("enter the nuber you want factorial of :");
     int  number= Integer.parseInt(br.readLine());
    		 for(int i = number; i>=1;i--) {
    			 fact*=i;
    			 
    		 }
    		 System.out.println(fact);
	}

}
