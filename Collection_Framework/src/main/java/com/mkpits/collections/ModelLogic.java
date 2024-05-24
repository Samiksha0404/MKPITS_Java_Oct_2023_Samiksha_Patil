package com.mkpits.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ModelLogic {

	public static void main(String[] args) {
		
     ArrayList<ModelClass> arr = new ArrayList<ModelClass>();
     
     arr.add(new ModelClass(67, "samiksha"));
     arr.add(new ModelClass(65, "sarthak"));
     arr.add(new ModelClass(674, "shivam"));
    
     for (Iterator iterator = arr.iterator(); iterator.hasNext();) {
		ModelClass modelClass = (ModelClass) iterator.next();
		System.out.println(modelClass);
	}
     
    
}

}