package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Table {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int table;
  BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
  System.out.println("enter the number to print table: ");
  int num = Integer.parseInt(b.readLine());
  for(int i = 1; i<=10; i++) {
	  
	  table = num*i;
	  System.out.println(num+"*"+i+" = "+table);
  }
  
	}

}
