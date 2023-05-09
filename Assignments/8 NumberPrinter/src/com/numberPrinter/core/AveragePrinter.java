package com.numberPrinter.core;

import java.util.stream.IntStream;

public class AveragePrinter implements Runnable {
	int start;
	int end;
	
	public AveragePrinter(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " started");
		try {
			System.out.println("Average of numbers within the range");
			double average = IntStream.rangeClosed(start, end).average().orElseThrow();
			System.out.println(average);
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " over");
	}
}
