///*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//
//Given a string s, return true if it is a palindrome, or false otherwise.
//
// 
//
//Example 1:
//
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.
//*/
package com.leetcode.problems;
class ValidPalindrome_125{
	
	public static void main(String args[]){
		ValidPalindrome_125 obj = new ValidPalindrome_125();
	        String str ="harsh";
	        System.out.println(obj.isPalindrome(str));
	        //str-argument
	    }
	
	
	
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
        	return true;
        }//s-parameter h
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
        	char currFirst = s.charAt(start);
        	char currLast = s.charAt(last);
        	if (!Character.isLetterOrDigit(currFirst )) {
        		start++;
        	} else if(!Character.isLetterOrDigit(currLast)) {
        		last--;
        	} else {
        		if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
        			return false;
        		}
        		start++;
        		last--;
        	}
        }
        return true;
    }
}