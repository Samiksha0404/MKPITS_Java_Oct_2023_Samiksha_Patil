package com.leetcode.problems;

public class Probem09 {


 //taking a method which will return true or false
    public boolean isPalindrome(int x) {
    	
//x is an input number
//checking if x is less than 0 if it is then it will instant return false
// because true || (false/true) = true if will run

//if it is greater than 0 then it will check second condition where && operator is used where only True && True = true
      if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        int reversed = 0;

//loop will run till half given number 
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        
// if its half number is matched and any one condition gets true it will return true
        return (x == reversed) || (x == reversed / 10);  
    }
	
	
	
	public static void main(String[] args) {
		
		Probem09_Palindrom_Number obj = new Probem09_Palindrom_Number();
		System.out.println(obj.isPalindrome(1218));
				
}
}