package com.mkpits.string;

public class StringMethodsAndConstructor {

	public static void main(String[] args) 
	{
		String fName="aembhkua";
		String lName="Aembh";
		// constructors of String Class 
		byte b[]= {65,66,67,69,97};
		//String s1=new String(b);
		System.out.println(new String(b)); //constructor which makes byte value into string char
		
		char [] ch= {'A','S','H','I','K'};
		System.out.println(new String(ch));
		System.out.println(new String(ch,2,3)); // 2 , 3 is offset is always smaller than length and count takes spaces for new array that should be wihin limit
		int[] a= {97,98,99,100,102,104};
		System.out.println(new String(a, 1, 5));
		
		String newString=new String(fName);// object to copy of 1 object to another 
		System.out.println(newString);

		// Methods of the String Class
		
		System.out.println(fName.compareTo(lName)); // compareTo andcompareToIgnore compare the value lexicographically means they compare with ascii value
		
		
		System.out.println(fName.codePointAt(1));// codePoint return the unicode value of perticular index value char
		
		StringMethodsAndConstructor s=new StringMethodsAndConstructor();
		s.concatString();
		s.containsStringChar();// true
		s.valueOfString();
		s.indexOfString();
		
		
	}

	// indexOf method always return the int value of perticular char present in string
	private void indexOfString() 
	{
		String cityName="Nagpur Navneet Nagar Wadi Nagpur";
		System.out.println(cityName.indexOf('N'));
		System.out.println(cityName.indexOf('a',2 ));// in this method count first occurrence after the given index
		System.out.println(cityName.indexOf("Nagpur", 2));// used with string // 28 
	}

	// convert the char arrays data into string only char value set 
	private void valueOfString() 
	{
		char[]ch= {'a','b','c','d'};
		System.out.println(String.copyValueOf(ch));
		System.out.println(String.copyValueOf(ch, 0, 2));
		
	}

	private void containsStringChar() 
	{
		String name="Pranav";
		System.out.println(name.contains("P"));
		
	}

	// concat the two string without print space
	private void concatString()
	{
		String fName="Ashik";
		String lName="Tembhare";
		System.out.println(fName.concat(lName));
		
	}

}
