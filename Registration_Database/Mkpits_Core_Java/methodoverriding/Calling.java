package com.mkpits.methodoverriding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calling {

	
		public static void main(String[] args) throws NumberFormatException, IOException {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter length and breadth");
			
			int l=Integer.parseInt(br.readLine());
			int b=Integer.parseInt(br.readLine());
			
		    Rectangle obj =new Square();
		    // we can call the superclass reference variable  with the child class constructor
		    
		    obj.area(l, b);
		    //call will be always given to the superclass method but the output will be given of child class 
		 
		   
			}

}
