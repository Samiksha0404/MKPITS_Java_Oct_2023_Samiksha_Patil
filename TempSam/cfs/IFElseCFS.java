package com.mkpits.cfs;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IFElseCFS {

		// TODO Auto-generated method stub


	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter First Number");
		int num1 = Integer.parseInt(br.readLine());
		
		System.out.println("Enter second Number");
		int num2 = Integer.parseInt(br.readLine());
		
		System.out.println("Enter third Number");
		int num3 = Integer.parseInt(br.readLine());
		
		if (num1 > num2 && num1>num3) {
			
			System.out.println("Number First is Greater");
			
		}else if (num2 > num1 && num2 > num3) {
			
			System.out.println("Number Second is Greater");
			
		}else if (num3 > num1 && num3>num2) {
			
			System.out.println("Number Third is Greater");
			
		}
	}

}
