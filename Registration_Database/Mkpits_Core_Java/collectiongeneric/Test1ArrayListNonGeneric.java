package com.mkpits.collectiongeneric;

import java.util.ArrayList;

public class Test1ArrayListNonGeneric {

	public static void main(String[] args) {
		
		// non-generic version
		ArrayList list=new ArrayList();
		list.add(785);
		list.add(45.44f);
		list.add(78.012546879);
		list.add("This is String");
		
		// getting size of the list
		System.out.println("Size of the :-"+list.size());
		
		// Iterates  the value from list 
		for (Object value : list)  // store the data into object form
		{
			System.out.println("-->"+value);
		}
		

	}

}
