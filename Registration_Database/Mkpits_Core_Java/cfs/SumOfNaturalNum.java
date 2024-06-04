package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SumOfNaturalNum {

	    static int sum=1;
		public static void main(String[] args) throws NumberFormatException, IOException {
			// TODO Auto-generated method stub
		 BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
	     System.out.println("enter the nuber till you want to print  :");
	     int  number= Integer.parseInt(br.readLine());
	    		 for(int i = 1; i<=number;i++) {
	    			 sum+=i;
	    			 
	    		 }
	    		 System.out.println(sum);
		}

	}