package com.mkpits.string;

public class StringBufferOverviewClass 
{

	public static void main(String[] args) 
	{
		StringBufferOverviewClass sbc=new StringBufferOverviewClass();
		//sbc.appendMethod();
		//sbc.capacityMethod();
		//sbc.codePointMethod();
		//sbc.compareToMethod();
		//sbc.deleteMethod();
		//sbc.insertMethod();
		//sbc.replaceMethod();
		//sbc.reverseMethod();
		//sbc.trimMethod();
		sbc.indexOfMethod();
		
		
		
		
	}

	private void indexOfMethod() 
	{
		StringBuffer n1=new StringBuffer("Ashik kumar");
		StringBuffer n2=new StringBuffer("kumar");
		System.out.println(n1.indexOf("k"));//Returns the index within this string of the first occurrence of thespecified substring.
		
		System.out.println(n1.offsetByCodePoints(5, 6));
		
		System.out.println(n1.indexOf("k", 5));
		
	}

	private void trimMethod() 
	{
		String name="Ashik kumar Tembhare     ";
		System.out.println(name);
		System.out.println(name.trim());
		
	}

	private void reverseMethod() 
	{
		StringBuffer name=new StringBuffer("ASHIK");
		System.out.println(name.reverse());
		
	}

	private void replaceMethod() 
	{
		StringBuffer villageName=new StringBuffer("Wardha Ravanwadi");
		System.out.println(villageName.replace(8, 11, "Wadi"));//Inserts the string representation of the charargument into this sequence. 
		
	}

	private void insertMethod() 
	{
		StringBuffer lang=new StringBuffer("Marath");
		System.out.println(lang.insert(lang.length(), 'i'));//Inserts the string representation of the charargument into this sequence. 
		
	}

	private void deleteMethod() 
	{
		StringBuffer stateName=new StringBuffer("Maharastra");
		System.out.println(stateName.delete(5, 8));//Removes the characters in a substring of this sequence.
		System.out.println(stateName.deleteCharAt(4));//Removes the char at the specified position in this sequence
	}

	private void compareToMethod() 
	{
		StringBuffer str1=new StringBuffer("Ashik");
		StringBuffer str2=new StringBuffer("AshikKumar");
		
		System.out.println("Laxicogicall diff:- "+str1.compareTo(str2));//Compares two StringBuffer instances lexicographically. This methodfollows the same rules for lexicographical comparison as defined in the  CharSequence.compare(this, another) method. 
		
	}

	private void codePointMethod() 
	{
		StringBuffer cityName=new StringBuffer("Nagpur");
		System.out.println(cityName.codePointAt(1));//Returns the character (Unicode code point) at the specifiedindex. The index refers to char values(Unicode code units) and ranges from 0 to length() - 1.
		
		
	}

	private void capacityMethod() 
	{
		String address="Navneet Nagar Wadi Nagpur 440023";
		StringBuffer add=new StringBuffer(address);
		System.out.println(add);
		
		System.out.println(add.capacity());//Returns the current capacity. The capacity is the number of charactersthat can be stored (including already written characters), beyond whichan allocation will occur.
		
		
	}

	private void appendMethod() 
	{
		StringBuffer fName=new StringBuffer("Ashik kumar");
		System.out.println(fName);
		
		String lName="Tembhare";
		
		System.out.println(fName.append(" "+lName)); // append Method used to concatiante the string ;
		System.out.println(fName.append(" "+145));
		System.out.println(fName);// stringBuffer is mutable 
	
		System.out.println(fName.append(lName,2,5)); // append with start point and end point
	}
	
	

}
