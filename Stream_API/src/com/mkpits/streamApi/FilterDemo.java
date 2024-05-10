package com.mkpits.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {

	public static void main(String[] args) {
 List<String> names = Arrays.asList("harsh","vinay","vaibhav");
 List<String> result = names.stream().filter(s -> s.startsWith("h")).collect(Collectors.toList());
	
	System.out.println(result);
	}

}
