package com.mkpits.methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AutoMorphicNumber {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number ");
		int num=Integer.parseInt(br.readLine());
		System.out.println(isAutomorphic(num)?"AutoMorphicNumber":"Not AutoMorphic");

	}

	private static boolean isAutomorphic(int num) 
	{
		int squre=num*num;
		System.out.println("Squre is "+squre);
		while(num>0)
		{
			if(num%10!=squre%10)
				return false;
			
			num/=10;
			squre/=10;
		}
		
		return true;
	}

}
