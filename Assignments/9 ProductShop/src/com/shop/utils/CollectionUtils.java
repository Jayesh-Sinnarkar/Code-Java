package com.shop.utils;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.shop.core.Product;

public interface CollectionUtils {

	// SORTS THE PRODUCT LIST AS PER THE SPECIFIED COMPARATOR
	public static List<Product> sorter(Map<Integer, Product> productMap, Comparator<Product> criteria) {
		return productMap.values().stream().sorted(criteria).collect(Collectors.toList());
	}
}
