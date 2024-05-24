package com.mkpits.practiseproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FriendlyPair {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter num1 and num2");
		
      int num1= Integer.parseInt(b.readLine());
      int num2= Integer.parseInt(b.readLine());
      
     int sum1= getDivisorSum(num1);
     int sum2 =getDivisorSum(num2);
     
     if((sum1/num1)==(sum2/num2)) {
    	 System.out.println(num1+","+num2+" is friendly pair");
     }else {
    	 System.out.println(num1+","+num2+" is not friendly pair");
     }

	}

	private static int getDivisorSum(int num) {

		 int sum=0;
		 for(int i=1; i<num ; i++) {
			 if(num%i==0) {
				 sum= sum+i;
			 }
		 }
		return sum;
	}
}



