package com.philips.dxr.programs;

import java.util.Arrays;

import com.philips.dxr.entity.Person;

public class P02_WorkingWithArrays {

	public static void main(String[] args) {

		Person[] people;
		people = new Person[5];
		people[0] = new Person("Vinod", 45, 5.8);
		people[1] = new Person("Ramesh", 25, 5.9);

		System.out.println(Arrays.toString(people));

	}

	static void testingTwoDimensionalArrays() {
		int nums[][];

		nums = new int[3][];
		nums[0] = new int[] { 10, 20 };
		nums[1] = new int[5];
		nums[2] = new int[3];

		for (int[] row : nums) {
			Arrays.toString(row);
		}

	}

	static void testSingleDimensionArrays() {

		int x = 10;
		Integer y = new Integer(x); // boxing
		int z = y.intValue(); // unboxing

		// 1.5 onwards
		y = x; // auto boxing
		z = y; // auto unboxing
		x = z;

		// int[] nums = {10, 20, 30, 40};
		Integer[] nums;

		nums = new Integer[] { 10, 20, 30, 40 };

		System.out.println("Numbers are: ");
		printArray(nums);

		String[] names = { "Vinod", "Shyam", "John", "Jane" };
		System.out.println("Names are: ");
		printArray(names);

		System.out.println(Arrays.toString(names));

		Person[] people = { new Person("Smith", 44, 5.6), new Person("Martin", 22, 5.7) };
		System.out.println("People are: ");
		printArray(people);
	}

	static void printArray(Object[] array) {
		for (Object num : array) {
			System.out.println(num);
		}
	}

}
