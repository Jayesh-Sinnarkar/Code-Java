package com.shop.tasks;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.shop.core.Product;
import com.shop.utils.CollectionUtils;
import com.shop.utils.IOUtils;

public class DatewiseSorter implements Runnable {
	
	Map<Integer, Product> productMap;
	String fileName;
	
	// CONSTRUCTOR
	public DatewiseSorter(Map<Integer, Product> productMap, String fileName) {
		this.productMap = productMap;
		this.fileName = fileName;
	}

	// RUN METHOD
	@Override
	public void run() {
		// LIST SORTED AS PER DATE OF MANUFCATURING
		List<Product> sortedList = CollectionUtils.sorter(productMap, (p1,p2)-> p1.getManufactureDate().compareTo(p2.getManufactureDate()));
		
		try{
			// WRITE TO FILE
			IOUtils.storeAsChars(sortedList, fileName);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
