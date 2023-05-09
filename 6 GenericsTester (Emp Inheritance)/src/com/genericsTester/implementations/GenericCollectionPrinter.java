package com.genericsTester.implementations;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;

public class GenericCollectionPrinter {
	public static void main(String[] args) {
	//ARRAYLIST TEST CASE
			ArrayList<Integer> intList = new ArrayList<>();
			intList.add(1);
			intList.add(2);
			intList.add(3);
			intList.add(4);
			intList.add(5);
			GenericUtils.printCollection(intList);
			
			HashSet<String> stringSet = new HashSet<String>();	//unordered, unsorted set
			stringSet.add("Hello");
			stringSet.add("World");
			stringSet.add("India");
			stringSet.add("Pune.");
			GenericUtils.printCollection(stringSet);
			
			ArrayDeque<Double> doubleQueue = new ArrayDeque<Double>();
			doubleQueue.add(1.23);
			doubleQueue.add(2.34);
			doubleQueue.add(3.45);
			doubleQueue.add(4.56);
			doubleQueue.add(5.67);
			GenericUtils.printCollection(doubleQueue);
	}
}
