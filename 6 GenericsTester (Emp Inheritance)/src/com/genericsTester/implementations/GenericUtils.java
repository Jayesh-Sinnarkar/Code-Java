package com.genericsTester.implementations;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import inheritance.Emp;

public class GenericUtils {
	// STATIC METHOD TO PRINT ELEMENTS OF ANY COLLECTION
	public static <T> void printCollection(Collection<T> collection) {
		for (T c : collection) {
			System.out.println(c);
		}
	}

	// METHOD TO TEST SHUFFLE AND REVERSE
	public static <T> void testShuffleAndReverse(List<T> list) {
		System.out.println("Before shuffle");
		list.forEach(d -> System.out.print(d + " "));

		System.out.println();
		Collections.shuffle(list);
		System.out.println("After shuffle");
		list.forEach(d -> System.out.print(d + " "));

		System.out.println();
		Collections.reverse(list);
		System.out.println("After reverse");
		list.forEach(d -> System.out.print(d + " "));
		System.out.println();
	}
	
	// SUM OF COMPUTED SALARY
	public static int sumOfSalary(List<? extends Emp> list) {
		int sum = 0;
		for(Emp e : list) {
			sum += e.computeSalary();
		}
		return sum;
	}
}
