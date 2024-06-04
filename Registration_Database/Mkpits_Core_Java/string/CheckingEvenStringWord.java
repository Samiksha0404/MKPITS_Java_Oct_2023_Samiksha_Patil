package com.mkpits.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// design: user input sentance and check the sentence have even number charecter 
// 
public class CheckingEvenStringWord {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String :");
		String sentance=br.readLine();
		String stringArray[]=sentance.split(" "); // split() used to separate the value from given expression
		
		//System.out.println(Arrays.toString(stringArray));
		
		for (int i = 0; i < stringArray.length; i++) 
		{
			String word;
			word=stringArray[i];
			if(word.length()%2==0) // length() method used to calculate the length of thr string
			{
				System.out.println(word);
			}
		}

	}

}
