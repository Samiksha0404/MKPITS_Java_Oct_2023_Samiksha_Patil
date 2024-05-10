package com.mkpits.streamApi;

import java.util.Arrays;
import java.util.List;

public class ReduceDemo {

	public static void main(String[] args) {
		List<Integer> numbers
        = Arrays.asList(2, 3, 4, 5, 2);
		int even = numbers.stream().filter(x -> x % 2 == 0).reduce(0, (ans,i) -> ans+i);
		System.out.println(even);

	}

}
