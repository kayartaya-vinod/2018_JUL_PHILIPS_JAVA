package co.vinod.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(12, 304, 50, 44, 29, 1, 39, 55, 33, 53, 19);

		int smallest = nums.stream().min((a, b) -> a - b).get();
		System.out.println("Smallest = " + smallest);

		int largest = nums.stream().max((a, b) -> a - b).get();
		System.out.println("Largest = " + largest);

		List<Integer> evens = nums.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
		List<Integer> doubledEvens = nums.stream().filter(a -> a % 2 == 0).map(a -> a * 2).collect(Collectors.toList());
		Integer max = nums.stream().collect(Collectors.maxBy((a, b) -> a - b)).get();
		
		System.out.println("evens: " + evens);
		System.out.println("doubledEvens: " + doubledEvens);
		System.out.println("Largest = " + max);
	}

}
