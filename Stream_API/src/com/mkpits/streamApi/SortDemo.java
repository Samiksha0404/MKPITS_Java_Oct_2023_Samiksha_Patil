package com.mkpits.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortDemo {

	public static void main(String[] args) {
	
List<String> names = Arrays.asList("harsh","abhi","vaibhav");
List<String> show = names.stream().sorted().collect(Collectors.toList());

System.out.println(show);
	
	}
}