package com.mkpits.jsp;

public class SumOfSquares {

	public static void main(String[] args) {
	    // Sample array with 30 integers
	    int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

	    // Initialize variable to store sum of squares
	    int sumOfSquares = 0;

	    // Loop through the array, accessing every 3rd element
	    for (int i = 2; i < myArray.length; i += 3) {
	      // Square the current element and add it to the sum
	      sumOfSquares += Math.pow(myArray[i], 2);
	    }

	    // Print the final sum of squares
	    System.out.println("Sum of squares of every 3rd element: " + sumOfSquares);
	  }
}
