package com.mkpits.collection;

import java.util.ArrayList;
import java.util.List;

public class SublistExample {

	public static void main(String[] args) {
		
		ArrayList<String>  arrlist = new ArrayList<String>(); 

    // Populating arrlist1 
    arrlist.add("harsh"); 
    arrlist.add("rahul"); 
    arrlist.add("adi"); 
    arrlist.add("kunal"); 
    arrlist.add("mangal pandey"); 

    // print arrlist 
    System.out.println("Original arrlist: "  + arrlist); 

    // getting the subList //from particular index to a particular index
    // using subList() method 
    
    List<String> arrlist2 = arrlist.subList(1, 4); 

    // print the subList 
    System.out.println("Sublist of arrlist: "+ arrlist2);
    
    
    arrlist.trimToSize();
    System.out.println("the list of elements");
    for (String str : arrlist) {
		System.out.println(str);
	}
	}

}
