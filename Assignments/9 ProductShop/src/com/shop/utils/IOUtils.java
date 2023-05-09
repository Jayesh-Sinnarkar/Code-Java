package com.shop.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.List;

import com.shop.core.Product;
import com.shop.exceptions.ProductHandlingException;

public class IOUtils {
	// STORE AS CHARACTER FILE
	public static void storeAsChars(List<Product> productList, String fileName)
			throws ProductHandlingException, IOException, FileNotFoundException {

		File file = new File(fileName);

		// VALIDATING INPUT FILE
		if (file.isFile() == false)
			throw new ProductHandlingException("Invalid file input");
		if (file.canWrite() == false)
			throw new ProductHandlingException("Write permission denied, can not write data.");
		
		// WRITING TO FILE
		try (PrintWriter pr = new PrintWriter(new FileWriter(fileName))) {
			productList.stream().forEach(product -> pr.println(product));
		}
		
		// SUCCESS MESSAGE
		System.out.println("Data stored successfully!");
	}

	// STORE AS BINARY FILE
	public static void storeAsBinary(List<Product> productList, String fileName)
			throws ProductHandlingException, IOException, FileNotFoundException {
		File file = new File(fileName);

		// VALIDATING FILE
		if (file.isFile() == false)
			throw new ProductHandlingException("Invalid file input");
		if (file.canWrite() == false)
			throw new ProductHandlingException("Write permission denied, can not write data.");

		// WRITING TO FILE
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
			out.writeObject(productList);
		}

		// SUCCESS MESSAGE
		System.out.println("Data stored successfully!");
	}

}
