package com.mkpits.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class HashMapSortingByKey 
{
	
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Integer>map=new HashMap<String, Integer>();
		System.out.println("How Many entrys Want To Add---->");
		byte entrys=Byte.parseByte(br.readLine());
		System.out.println("Enter Name With Value --->");
		for (int i = 0; i < entrys; i++) 
		{
			map.put(br.readLine(), Integer.parseInt(br.readLine()));
		}
		
		hasMapSort(map);
	}

	private static void hasMapSort(HashMap<String, Integer> map) 
	{
		ArrayList<String>keySort=new ArrayList<>(map.keySet());
		Collections.sort(keySort);
		Collections.reverse(keySort);
		
		for (String key : keySort) 
		{
			System.out.println("Key :---> "+key+" Value :---> "+map.get(key));
		}
		
	}

}
