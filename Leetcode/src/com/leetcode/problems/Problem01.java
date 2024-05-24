package com.leetcode.problems;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.

//Example 1:
//
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//Example 2:
//
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
//Time complexity => O(n)

import java.util.HashMap;
import java.util.Map;

public class Problem01{
//creating a method []twoSum because we are returning an array and in it taking an input of given array  and targeted value
	 static int []twoSum(int[] num , int target) {
		//creating an object of hashmap here naming numIndex
		Map < Integer , Integer> numIndex = new HashMap<>();
		//loop will run till array size of given input
		for (int i = 0; i < num.length; i++) {
			//it will check that numIndex have a value of target-num[i].
			//eg => 6-3=3 but initially numIndex khali hai to false hoga   dry run karne pr pata chalega
			if (numIndex.containsKey(target-num[i])) {
				//here it will return an new array
//eg => i=2 then  if stament will be true and it return  indexes of  2 and 4 from given arr{numIndex.get(6-4) , 2}
				//numIndex.get(6-4) isse 2 (value) ki index means 1 milega  => op {1,2} ye return hoga
				return new int[] {numIndex.get(target-num[i]),i};
			}
	//Initially numIndex khali hai isliye if  statement nahi chalega or uske baad numIndex me values Add hote jayegi	
			numIndex.put(num[i], i);
		}
		//luch nhi milne pr ye khali ruturn ho jayega
		return new int[] {};
	}
	
	
	
	public static void main(String[] args) {
		//this is given input
		int [] arr = {3,2,4};	
		
		//twoSum method is returning an array thats why we have to hold it in array otherwise it will return obj reference
		int []op = twoSum(arr, 7);
		//printing the  desired array indexes 
		for (int i : op) {
			System.out.println(i);
		}
		
	}

}
