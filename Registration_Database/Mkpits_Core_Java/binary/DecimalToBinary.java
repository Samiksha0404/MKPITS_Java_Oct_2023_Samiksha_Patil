package com.mkpits.binary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecimalToBinary {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Decimal Number------->");
	    long num = Long.parseLong(br.readLine());
	    System.out.println("Decimal to Binary");

	    // call method to convert to binary
	    long binary = convertDecimalToBinary(num);

	    System.out.println("\n" + num + " = " + binary);
	 }

	
	
	  public static long convertDecimalToBinary(long n) 
	  {

	    long binaryNumber = 0;
	    long remainder, i = 1, step = 1;

	    while (n!=0) {
	      remainder = n % 2;
	        System.out.println("Step " + step++ + ": " + n + "/2");

	        System.out.println("Quotient = " + n/2 + ", Remainder = " + remainder);
	        n /= 2;

	        binaryNumber += remainder * i;
	        i *= 10;
	  }
	    
	    return binaryNumber;
	}

}
