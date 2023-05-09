package com.shop.tester;

import java.util.HashMap;
import java.util.Scanner;

import com.shop.core.Product;
import com.shop.tasks.DatewiseSorter;
import com.shop.tasks.PricewiseSorter;
import com.shop.utils.ShopUtils;

public class Tester {

	public static void main(String[] args) {
		
		// MAP WITH STUB DATA
		HashMap<Integer, Product> productMap = (HashMap<Integer, Product>)ShopUtils.populateProductMap(ShopUtils.populateProductList());
		
		try(Scanner sc = new Scanner(System.in)) {
		
			// INPUT FILE NAME - FILE TO WRITE TO
			System.out.println("Enter the file name (Price wise sorted)");
			String priceFile = sc.next();
		
			// INITIATE THE THREAD TO SORT AND STORE PRICE WISE
			Thread sortPricewise = new Thread(new PricewiseSorter(productMap, priceFile), "pricewiseSorterTask");
			sortPricewise.start();
			
			// INPUT FILE NAME - FILE TO WRITE TO
			System.out.println("Enter the file name (Date wise sorted)");
			String dateFile = sc.next();
			
			// INITIATE THE THREAD TO SORT AND STORE DATE WISE
			Thread sortDatewise = new Thread(new DatewiseSorter(productMap, dateFile), "datewiseSorterTask");
			sortDatewise.start();	
			
			// TESTER WAITS FOR THREAD TO COMPLETE - NO ORPHANS
			sortDatewise.join();
			sortPricewise.join();
		
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}
