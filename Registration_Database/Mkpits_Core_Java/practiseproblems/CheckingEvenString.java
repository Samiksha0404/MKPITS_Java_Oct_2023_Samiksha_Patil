package com.mkpits.practiseproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckingEvenString {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the string ");
		String sentence = br.readLine();
		String stringArray[] = sentence.split(" ");
		//Splits this string around matches of the given regular expression.
		
		for(int i=0; i< stringArray.length; i++) {
			String word = stringArray[i];
			if(word.length()%2==0) {
				System.out.println(word);
			}
		}

	}

}
