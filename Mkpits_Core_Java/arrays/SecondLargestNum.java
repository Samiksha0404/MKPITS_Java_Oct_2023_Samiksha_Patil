package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondLargestNum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int temp, i ,j = 0 ;
	BufferedReader	br = new BufferedReader(new InputStreamReader(System.in));
	 System.out.println("Enter the range of array");
		int range = Integer.parseInt(br.readLine());
        int num[] = new int[range];
        
     		for (int k = 0; k<range; k++) {
		 num[k]= Integer.parseInt(br.readLine());
		}
	
	 
		for (i = 0; i<num.length; i++) {
			
			for(  j=i+1 ; j<num.length;j++ ) {
				
				if(num[i]>num[j]) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;	
				}
			}
			
		}
		int largest =num[num.length-1];
		
		System.out.println(largest+"is largest element in the array");
		
		int secondlargest=0;
		
		for(int k=0; k <num.length; k++) {
			
			if(largest > num[k]) {
			 secondlargest = num[k];
			}
		}
		System.out.println(" the second largest : "+secondlargest);
		
		
// to print sorted array:
//		System.out.println("the sorted array is: ");
//
//		for (i = 0; i<num.length; i++) {
//			
//		System.out.println(num[i]);
//		
//}
//		System.out.println();
		
	
}
}
