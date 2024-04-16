package com.leetcodes.problems;

import java.util.Arrays;

//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
//and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
//Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
//To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
//and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

//Example 1:
//
//Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//Output: [1,2,2,3,5,6]
//Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
//The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
//Example 2:
//
//Input: nums1 = [1], m = 1, nums2 = [], n = 0
//Output: [1]
//Explanation: The arrays we are merging are [1] and [].
//The result of the merge is [1].
//Example 3:
//
//Input: nums1 = [0], m = 0, nums2 = [1], n = 1
//Output: [1]
//Explanation: The arrays we are merging are [] and [1].
//The result of the merge is [1].
//Note that because m = 0, there are no elements in nums1. 
//The 0 is only there to ensure the merge result can fit in nums1.


public class Problem88_MergeSortedArray {

	
		
	// isme 2 array diya hai jinko num1 me store karna hai or uski length m+n hona
	// chahiye
	// passing two input arrays and two values m and n

	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		// taking for loop where i = m and j=0 and j<n;

		for (int j = 0, i = m; j < n; j++) {

//direct num1[i] me m ki length k baad hi add karna start karenge 
//nums2[j] ki value starting se add karenge nums1 me

			nums1[i] = nums2[j];

//i++ and j++ kardiya for next iteration jo ki j<n tak chalega kyunki i already m se hi start hua hai
			i++;
		}

//iske baad array ko sort kardenge sort method use karke

		Arrays.sort(nums1);
		System.out.println("Your array is Sorted and Merged : ");

		for (int i : nums1) {
			System.out.print(i + " ");
		}

	    }
	
	
	public static void main(String[] args) {

		int arr []= {1,2,3,0,0,0};
		int arr1 []= {2,5,6};
		int m= 3;
		int n=3;
		
		merge(arr, m, arr1, n);
		
	}

}
