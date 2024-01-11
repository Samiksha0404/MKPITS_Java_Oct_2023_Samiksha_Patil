package com.mkpits.practiseproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Automorphic {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Automorphic obj = new Automorphic();
		
		System.out.println("enter number");
		int input = Integer.parseInt(br.readLine());
		
		
		System.out.println(obj.getAutomorphic(input)? "this is automorphic number" : "this is not automorphic number");
		
		
		
	}

	boolean getAutomorphic(int num) {
		int square = num*num;
		
		while(num>0) 
		{
		if(num%10 == square%10)
		{
			num/=10;
			square/=10;
			continue;
		}
			return false;
		}
		
		return true;
		
	}

}
