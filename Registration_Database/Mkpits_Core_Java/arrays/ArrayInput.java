package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayInput {
	static double price[];
    static BufferedReader br;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
  ArrayInput obj = new ArrayInput();
		obj.inputArray();
        obj.arrayOutput();
	
	}



	private void arrayOutput() {
		// TODO Auto-generated method stub

	      for(int i = 0;i<price.length;i++) {
		
		 System.out.println("the price at "+i+" are: "+price[i]);
	      }
	}

	private void inputArray() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
        br = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter the 5 price ");
        price= new double[5];
		for(int i = 0;i<price.length;i++) {
			  price[i]= Integer.parseInt(br.readLine());
			 	
	}

	}
	}
