package com.mkpits.practice;

public class ProblemStatement {
	
	    public static void main(String[] args) {
	        char[] array1 = {'a','b','c','g'};
	        char[] array2 = {'g','o','a','l'};

	        boolean found = searchElement(array1, array2);

	        if (found) {
	            System.out.println("Element found in the second array.");
	        } else {
	            System.out.println("Element not found in the second array.");
	        }
	    }

	    // Function to search for an element in the second array
	    private static boolean searchElement(char[] arr1, char[] arr2) {
	    	boolean found = false;
	        for (char element : arr1) 
	        {
	            for (char compareElement : arr2) 
	            {
	                if (element == compareElement) 
	                {
	                    found = true;
	                    System.out.println(compareElement);
	                    break;
	                }
	            }

//	            if (!found) 
//	            {
//	                return false; // Element not found in the second array
//	            }
	        }

	        return found ; // All elements found in the second array
	    }
	}


