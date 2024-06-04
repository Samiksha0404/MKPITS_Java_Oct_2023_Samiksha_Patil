package com.mkpits.pattern;

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	
	
	public class SquarePattern {
	

		public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
			
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  System.out.println("enter the number for stars:");
	 int num = Integer.parseInt(br.readLine());
	     for(int i=0;i<=num;i++) {
		 for(int j=1;j<=num;j++) {
			 System.out.print("* ");
		 }
		 System.out.println("* ");
	     }
	}

	}

