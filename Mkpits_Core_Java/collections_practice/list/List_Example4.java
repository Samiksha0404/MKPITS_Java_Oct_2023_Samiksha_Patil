package com.mkpits.collections_practice.list;

import java.util.ArrayList;
import java.util.List;

public class List_Example4 {

	public static void main(String[] args) {
		
		List list=new ArrayList();
		list.add(10);
		list.add("Ashik");
		list.add(1458);
		list.add('A');
		list.add(458.25);
		list.add(75.25f);
		list.add(85234);
		list.add(452);
		list.add("Tembhare");
		list.add("Ram Chandra");
		list.add(10);
		list.add(30);
		list.add(10);
		list.add('C');
		System.out.println("Non Generic List----->"+list);
		ArrayList<Integer>num=new ArrayList<Integer>();
		for (Object obj : list) 
		{
			if(obj instanceof Integer)
			{
				num.add((Integer) obj);
			}
		}
		
		System.out.println("Integer Array List---->"+num);
		

	}

}
