package com.numberPrinter.core;

import java.util.stream.IntStream;

public class EvenPrinter implements Runnable {
	int start;
	int end;
	
	public EvenPrinter(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " started");
		try {
			System.out.println("Even numbers within the range");
			IntStream.rangeClosed(start, end).filter(i -> i%2 == 0).forEach(System.out::println);
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " over");
	}
}
