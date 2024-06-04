package com.mkpits.arrays;

import java.util.Arrays;

public class CopyOfRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]= {12,13,14,15,16,17,18};
     //to index is within the range
     int[] copy = Arrays.copyOfRange(arr, 2, 6);
    // between 0 t0 7 position will print
     for (int i : copy)
         System.out.print(i + "  ");
	}

}
