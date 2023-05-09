package com.numberPrinter.driver;

import java.util.Scanner;

import com.numberPrinter.core.AveragePrinter;
import com.numberPrinter.core.EvenPrinter;
import com.numberPrinter.core.OddPrinter;

public class Driver {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Main started");
			
			
			
			System.out.println("Enter the lower bound of range");
			int start = sc.nextInt();
			
			System.out.println("Enter the upper bound of range");
			int end = sc.nextInt();
			
			Thread EvenPrinterTask = new Thread(new EvenPrinter(start, end), "EvenPrinter");
			Thread OddPrinterTask = new Thread(new OddPrinter(start, end), "OddPrinter");
			Thread AveragePrinterTask = new Thread(new AveragePrinter(start, end), "AveragePrinter");
			
			System.out.println("Main started execution of child threads");
			EvenPrinterTask.start();
			OddPrinterTask.start();
			AveragePrinterTask.start();
			
			System.out.println("Main waiting on child threads");
			EvenPrinterTask.join();
			OddPrinterTask.join();
			AveragePrinterTask.join();
			
			System.out.println("Main over");
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
