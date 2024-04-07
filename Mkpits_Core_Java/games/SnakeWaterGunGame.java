package com.mkpits.games;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SnakeWaterGunGame {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		char ch='A';
		byte num=(byte) Math.ceil(Math.random()*100);
		System.out.println(num);
		 if(num<=32)
		 {
			 ch='s';
		 }
		 if(num>=33 && num<=69)
		 {
			 ch='g';
		 }
		 if(num>=70 && num<=100)
		 {
			 ch='w';
		 }
		
		 System.out.println("Enter your choice s/g/w");
		 char uch=(char) br.read();
		 br.readLine();
		
		 
		 if((ch=='s' || ch=='S') && (uch=='w' || uch=='W'))
		 {
			 System.out.println("Snake Win");
		 }
		 if((ch=='w' || ch=='W') && (uch=='g' || uch=='G'))
		 {
			 System.out.println("Water win");
		 }
		 if((ch=='s' || ch=='S') && (uch=='g' || uch=='G'))
		 {
			 System.out.println("Gun Win");
		 }
				 
				
	}

}
