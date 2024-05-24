package com.leetcode.problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Prblm88_MergeSortedArr {

	public static void main(String[] args) {
		Prblm88_MergeSortedArr obj = new Prblm88_MergeSortedArr();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int nums1[] = new int[m]];
		for(int i = 0; i< m; i++) {
		nums1[i] =  Integer.parseInt(br.readLine());
		}
		int nums2[] = new nums2[10];
		nums2[] =  Integer.parseInt(br.readLine());
		
		int m = nums1.length; 
		int n = nums2.length;
		
		//int nums1[]= {1,2,3,0,0,0};
		//int nums2[]= {2,5,6};
		
		
		
		obj.merge(nums1, m, nums2, n);
      
       
       
	}
	


		public void merge(int nums1[], int m, int nums2[], int n) {
		for(int j=0, i = n ; j<n; j++) {
			nums1[i] = nums2[j];
			i++;
			
		}
		Arrays.sort(nums1);
		for (int i : nums1) {
			System.out.print(i);
		}
		
	}
		
	
	

}
