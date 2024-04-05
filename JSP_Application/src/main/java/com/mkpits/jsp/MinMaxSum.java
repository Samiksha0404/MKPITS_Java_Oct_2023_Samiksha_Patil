package com.mkpits.jsp;

public class MinMaxSum {
	 public static void main(String[] args) {
		    // Sample array of 5 positive integers
		    int[] arr = {9, 5, 3, 7, 1};

		    // Find minimum and maximum sum
		    long minSum = findMinSum(arr);
		    long maxSum = findMaxSum(arr);

		    // Print result
		    System.out.println(minSum + " " + maxSum);
		  }

		  // Function to find the minimum sum of four elements
		  private static long findMinSum(int[] arr) {
		    long minSum = Long.MAX_VALUE;
		    for (int i = 0; i < arr.length; i++) {
		      long currentSum = 0;
		      for (int j = 0; j < arr.length; j++) {
		        if (i != j) {
		          currentSum += arr[j];
		        }
		      }
		      minSum = Math.min(minSum, currentSum);
		    }
		    return minSum;
		  }

		  // Function to find the maximum sum of four elements
		  private static long findMaxSum(int[] arr) {
		    long maxSum = Long.MIN_VALUE;
		    for (int i = 0; i < arr.length; i++) {
		      long currentSum = 0;
		      for (int j = 0; j < arr.length; j++) {
		        if (i != j) {
		          currentSum += arr[j];
		        }
		      }
		      maxSum = Math.max(maxSum, currentSum);
		    }
		    return maxSum;
		  }
}
