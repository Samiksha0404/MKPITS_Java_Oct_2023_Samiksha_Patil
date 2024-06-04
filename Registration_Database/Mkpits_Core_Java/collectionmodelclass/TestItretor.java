package com.mkpits.collectionmodelclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class TestItretor {

	public static void main(String[] args) {
		
		List<Integer>list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext())
		{
			list.remove(itr);
		}

		System.out.println(list);
	}

}
