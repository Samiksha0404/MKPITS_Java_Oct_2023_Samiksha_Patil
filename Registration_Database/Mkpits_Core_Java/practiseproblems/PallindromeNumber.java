package com.mkpits.practiseproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PallindromeNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 System.out.println("Enter the number you want to check");
		int num = Integer.parseInt(br.readLine());
		
		int temp, reverse = 0 ,remainder ;
			
		temp = num;
		//temp is a temporary variable;
		//reverse is used here to store reverse number 
		
		while(temp!=0) {
			remainder = temp%10;
			reverse = reverse*10 + remainder;
			temp /= 10;
		}
		if(num==reverse) {
			System.out.println("This is pallindrome number");
		}else {
			System.out.println("This is not a pallindrome number");
		}
					
	}

}
