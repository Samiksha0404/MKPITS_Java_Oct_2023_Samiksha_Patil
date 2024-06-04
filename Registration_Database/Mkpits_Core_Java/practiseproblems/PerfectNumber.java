package com.mkpits.practiseproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*A Number that can be represented as the sum of it's factors except the number itself is known as the Perfect Number.
 * Example
Input : 6
Output : Yes, It's a Perfect Number
Explanation : Number = 6
Factors of 6 except 6 are 1, 2 and 3. 
When we add the three we get 6 itself. Therefore, it's a Perfect Number.
 */

public class PerfectNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number");
		int num=Integer.parseInt(br.readLine());
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
			sum=sum+i;
		}
			
	}if(sum==num) {
		System.out.println(num+" is perfect number");
	}else {
		System.out.println(num+" not a perfect number");
	}

}
}