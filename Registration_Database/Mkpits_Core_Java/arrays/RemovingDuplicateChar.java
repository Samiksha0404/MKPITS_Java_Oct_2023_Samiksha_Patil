package com.mkpits.arrays;

import java.util.Iterator;

public class RemovingDuplicateChar {

	public static void main(String[] args) 
	{
		RemovingDuplicateChar rc=new RemovingDuplicateChar();
		
		rc.charRemove();
	}

	private void charRemove() 
	{
		int counter=0;
		String name="Shi Shrikant Tambaskar Sir";
		char ch[]=new char[name.length()];
		char n;
		String s="";
		for (int i = 0; i < ch.length; i++) 
		{
			for (int j = 0; j < ch.length; j++) 
			{
				if(ch[i]==ch[j])
				{
	
					//System.out.println(s);
					counter++;
					//continue;
				}else
					ch[i]=name.charAt(i);
					
			}
			//System.out.println();
		}
		System.out.println("REmoving");
		//System.out.println(s);
		for (char c : ch) {
			System.out.print(c);
		}
		
	}

}
