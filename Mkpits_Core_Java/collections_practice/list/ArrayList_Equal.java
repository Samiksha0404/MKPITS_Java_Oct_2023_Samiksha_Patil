package com.mkpits.collections_practice.list;

import java.util.ArrayList;

public class ArrayList_Equal {

	public static void main(String[] args) {


		ArrayList<String>cityName1=new ArrayList<String>();
		cityName1.add("Nagpur");
		cityName1.add("Nashik");
		cityName1.add("Kanpur");
		cityName1.add("Gondia");

		ArrayList<String>cityName2=new ArrayList<String>();
		cityName2.add("Nagpur");
		cityName2.add("Nashik");
		cityName2.add("Kanpur");
		cityName2.add("Gondia");
		
		System.out.println("List Are----\n"+cityName1+"\n"+cityName2);
		//Compares the specified object with this list for equality. Returns true if and only if the specified object is also a list,
		System.out.println(cityName1.equals(cityName2)?"Both List Are Equls":"Both Are Not Equal");

		

	}

}
