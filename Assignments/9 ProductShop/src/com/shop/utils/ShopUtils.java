package com.shop.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.shop.core.Product;

import static com.shop.core.Category.*;
import java.time.LocalDate;

public interface ShopUtils {
	
	// RETURNS A LIST POPULATED WITH STUB DATA
	static List<Product> populateProductList() {
		List<Product> list = new ArrayList<>();

		list.add(new Product(10, "Brown_Bread", "Healthy Bread", 100, 40, BREAD, LocalDate.now()));
		list.add(new Product(100, "White_Bread", "Tasty Bread", 70, 35, BREAD, LocalDate.parse("2022-05-09")));
		list.add(new Product(50, "Marie", "Healthy Biscuits", 80, 10, BISCUITS, LocalDate.parse("2022-05-01")));
		list.add(new Product(40, "Monaco", "Salty Biscuits", 75, 15, BISCUITS, LocalDate.parse("2022-04-21")));
		list.add(new Product(60, "Sunflowe_Oil", "Healthy Oil", 50, 240, OIL, LocalDate.parse("2022-01-20")));
		list.add(new Product(70, "Gemini_Oil", "Vegetable Oil", 80, 220, OIL, LocalDate.parse("2022-01-30")));
		list.add(new Product(80, "Mango", "Seasonal Fruit", 45, 800, FRUITS, LocalDate.parse("2022-05-06")));
		list.add(new Product(15, "Watermelon", "Great Fruit", 60, 70, FRUITS, LocalDate.parse("2022-05-04")));
		
		return list;
	}

	// RETURNS A MAP POPULATED WITH STUB DATA
	static Map<Integer, Product> populateProductMap(List<Product> productList) {
		Map<Integer, Product> map = new HashMap<>();
		for (Product p : productList)
			map.put(p.getProductId(), p);
		return map;
	}

}
