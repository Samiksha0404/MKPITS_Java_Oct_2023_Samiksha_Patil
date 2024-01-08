package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiDemension {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
   BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
   System.out.println("enter values ");
   int arr[][] = new int[3][5];
   for(int i=0;i<3;i++) {
	   for(int j=0;j<5;j++) {
		  arr[i][j] = Integer.parseInt(b.readLine());
		  // System.out.println(arr[i][j]+" ");
	   }
   }
      //System.out.println();
	
	
	 for(int i=0;i<3;i++) {
		   for(int j=0;j<5;j++) {
			  //arr[i][j] = Integer.parseInt(b.readLine());
			   System.out.print(arr[i][j]+" ");
		   }
		   System.out.println();
	   }

}
}
