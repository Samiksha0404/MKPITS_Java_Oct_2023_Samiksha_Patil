package com.mkpits.boundedclass;

public class BoundedClass {

	public static void main(String[] args) {

         Double arr[]= {12.3,34.6,24.78,121.67,13.1};
         PrintData<Double> printarr = new PrintData<Double>();
         printarr.print(arr);
         
         Integer arr1[]= {12,45,67,79,34,56};
         PrintData<Integer> printarr1 = new PrintData<Integer>();
         printarr1.print(arr1);
         
        
         
	}

}
