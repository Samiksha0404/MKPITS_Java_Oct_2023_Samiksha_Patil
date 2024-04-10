package com.leetcode.problems;

//Given a sorted array of distinct integers and a target value, return the index if the target is found. 
//If not, return the index where it would be if it were inserted in order.
//
//		You must write an algorithm with O(log n) runtime complexity.
//
//		 
//
//		Example 1:
//
//		Input: nums = [1,3,5,6], target = 5
//		Output: 2
//		Example 2:
//
//		Input: nums = [1,3,5,6], target = 2
//		Output: 1
//		Example 3:
//
//		Input: nums = [1,3,5,6], target = 7
//		Output: 4

// BINARY SEARCH IS USED     =>  O(LOG N)

public class Problem35 {

	int searchInsert( int []num, int target) {
		 int start =0;
		 int end = num.length-1;	
// start and end  variables are  used to point index of an array	 
		 
		 while( start <= end) {
			 //mid point of an array
			 int mid = start + (end -start)/2;
			 
			 if(num[mid] == target) return mid;
			 //if target is at mid it will be returned
			 else if(num[mid]>target) end=mid-1;
			 //otherwise if its greater then mid end point  will shifted to before mid 
			 else start =mid+1;
			 //if mid is less than target then start point will be shifted after mid 
		 }
		return start;
		
	}
	
	
	public static void main(String[] args) {

		Problem35 call = new Problem35();
		
		int arr[] = { 1,3,5,6};
		int outputIndex =call.searchInsert(arr, 2);
		System.out.println(outputIndex);
		
	}

}
              










