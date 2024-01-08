package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string : ");
    // String  name ="Harsh Gupta";
		String name = b.readLine();
     
     char ch[]= new char[name.length()];
     
     for(int i= 0; i<name.length(); i++)
     {
    	 ch[i]=name.charAt(i);
    	 
     }
     
     for(char c : ch)
     {
    	 System.out.print(c);
     }
     System.out.println("\nReverse string is: ");
     
     for(int i = name.length()-1; i>=0; i--)
     {
    	 System.out.print(ch[i]);
     }
	}

}
