package com.mkpits.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SetDemo {

	public static void main(String[] args) {
		 List<Integer> numbers
         = Arrays.asList(2, 3, 4, 5, 2);

     // collect method returns a set
     Set<Integer> squareSet
       = numbers.stream()
         .map(x -> x * x)
         .collect(Collectors.toSet());
    
     System.out.println(squareSet);
	}

}
