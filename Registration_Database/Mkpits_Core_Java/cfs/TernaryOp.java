package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TernaryOp {
	  
      static int a, b, c;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter 3 numbers");
		a= Integer.parseInt(br.readLine());
		b= Integer.parseInt(br.readLine());
		c= Integer.parseInt(br.readLine());
		
		int grt1 = ((a>b)&&(a>c)||(b>a)&&(b>c))? a:b;
		
		int grt2 = (grt1>c)? grt1:c;
		System.out.println("the grter num is:" +grt2);
	
	}

}
