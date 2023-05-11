package com.genericsTester.implementations;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ShuffleAndReverse {
	public static void main(String[] args) {
		
		//VECTOR TEST CASE
		Vector<String> fruitList = new Vector<>();
		fruitList.add("Mango");
		fruitList.add("Apple");
		fruitList.add("Orange");
		fruitList.add("Peach");
		fruitList.add("Papaya");
		fruitList.add("Banana");
		
		GenericUtils.testShuffleAndReverse(fruitList);
		
		//LINKEDLIST TEST CASE
		LinkedList<Double> doubleList = new LinkedList<>();
		doubleList.add(1.23);
		doubleList.add(2.34);
		doubleList.add(3.45);
		doubleList.add(4.56);
		doubleList.add(5.67);
		
		GenericUtils.testShuffleAndReverse(doubleList);
		
		//ARRAYLIST TEST CASE
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		
		GenericUtils.testShuffleAndReverse(intList);
		
	}
}
