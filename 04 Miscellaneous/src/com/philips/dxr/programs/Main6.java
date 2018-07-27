package com.philips.dxr.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main6 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 384, 8, 3, 55, 23, 56, 78, 33, 45, 55, 56);

		List<Integer> list = numbers.stream()
			.filter(n->n%2==0)
			.map(n->n*2)
			.collect(Collectors.toList());
		
		System.out.println(list);
	}

}
