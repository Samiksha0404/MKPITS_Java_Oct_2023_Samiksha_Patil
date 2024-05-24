package com.mkpits.set;

import java.util.EnumSet;
import java.util.Set;

//program to demonstrate the 
//creation of the set object 
//using the EnumSet class

enum Enum{CODE, LEAF, STUDY , WIN};

public class Example4_Enum {

	public static void main(String[] args) {
		Set<Enum> set1 ;
		
		set1 = EnumSet.of(Enum.CODE,Enum.LEAF,Enum.STUDY, Enum.WIN);
		System.out.println("Set 1: " + set1); 
	}

}
