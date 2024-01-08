package com.mkpits.practiseproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumofNum {

	public static void main(String[] args) throws NumberFormatException, IOException {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      System.out.println("Enter the number : ");//to print number
      
       int num = Integer.parseInt(br.readLine());
       
       int sum = 0;
       int single=0;
       
       
       while(num>0 || sum>10) {
    	   if(num==0) {
    	     num= sum;
    	     sum=0;
       } 
    	   
    	   sum += num % 10;
    	   num = num/10;
      
	}
       System.out.println("The sum of the number is: "+sum);
}
}