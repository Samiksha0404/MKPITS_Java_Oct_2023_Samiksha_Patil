package com.leetcode.problems;

//Given an integer numRows, return the first numRows of Pascal's triangle.
//In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

//Example 1:
//Input: numRows = 5
//Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

//Example 2:
//Input: numRows = 1
//Output: [[1]]

//Time complexity => O(n)


import java.util.*;

public class Problem118 {
	//taking list as a datatype of generate method becasuewe want to return list
	public static List<List<Integer>> generate(int numRows) {
		
		//taking List<List<Integer>> because we are taking arraylist in a arraylist 
		//eg => [[1],[1,1],[1,2,1]]
	    List<List<Integer>> ans = new ArrayList<>();
	    
//loop will run till given input numRows
	    for (int i = 0; i < numRows; ++i) {
	    	
	    	//assigning size to  temp each time when loop starts
	      Integer[] temp = new Integer[i + 1];
	      
	      //filling the temp with 1 according to its size each time
	      Arrays.fill(temp, 1);
	      
	      //adding the temp into the ans list using arrays class method name asList
	      ans.add(Arrays.asList(temp));
	    }
                                 	    // indexes of ans in row
//after that will get ans= [[1],               0
	    //                  [1,1],             1
	    //                  [1,1,1],           2
	    //                  [1,1,1,1]]         3
	    
	    //now we have outer loop for row and inner for columns
	    //outer is starting from 2 because we want to update third row  
	    for (int i = 2; i < numRows; i++)
// inner loop will trace columns  and it will run till size of column -1 because we dont want to change last digit which is 1
//after printing each row ineer loop again starts from j=1
	    	for (int j = 1; j < ans.get(i).size() - 1; j++){
	    		//here with (ans.get [i]) we are getting row where we want to update the sum
	    		//and with set(index, value we are updating value of specific index
	    		//get(i-1) means previous row where we will add the number and print in next row
	        ans.get(i).set(j, ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
	      }
	    //it will return our list when we call this method
	    return ans;
	  }
	
	
	
	public static void main( String args[]) {
		
		List<List<Integer>>temp = generate(6);
		
		for (List<Integer> list : temp) {
			System.out.println(list);
		}
		
	}
	
	}



    

        

