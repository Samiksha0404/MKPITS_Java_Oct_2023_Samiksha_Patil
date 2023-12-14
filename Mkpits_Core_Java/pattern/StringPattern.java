package com.mkpits.pattern;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringPattern {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  System.out.println("enter the word :");
  String s= br.readLine();
  
   int num = s.length();
   int arr[]= new int[num];
     for(int i=0;i<=num;i++) {
	 for(int j=1;j<=i;j++) {
		 System.out.print(arr[j]);
	 }
	 System.out.println(arr[0]);
     }
}

}

