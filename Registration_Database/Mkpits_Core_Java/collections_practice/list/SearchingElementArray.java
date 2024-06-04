package com.mkpits.collections_practice.list;

public class SearchingElementArray {

	public static void main(String[] args) 
	{
	
		Character[]char1= {'a','c','d','b'};
		Character[]char2= {'z','a','d','n'};
		
		for (int i = 0; i < char1.length; i++) 
		{
			for (int j = 0; j < char2.length; j++) 
			{
				if(char1[i]==char2[j])
				{
					System.out.println(char2[j]);
				}
			}
			
		}

	}

}
