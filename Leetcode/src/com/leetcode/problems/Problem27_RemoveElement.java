package com.leetcode.problems;

public class Problem27_RemoveElement {
	    public void removeElement(int[] nums, int val) {
	        int index = 0;
	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] != val) 
	            // if num[i] is matches with the value then if condition will not execute
	            // and if num[i] does not matches with the value then the value of num[i] will be stored in num[index]
	            {
	                nums[index] = nums[i];
	                index++;
	            }
	        }
	        for(int i=0; i<index; i++) {
	        	
	        	System.out.print(nums[i] +" ");
	        	
	        	//to print new given array
	        	
	        }
	    }

	public static void main(String[] args) {
		Problem27_RemoveElement obj = new Problem27_RemoveElement();
		int arr[] = {0,1,4,2,0,4,5};
		int val = 4;
		
	obj.removeElement( arr, val);

	}

}
