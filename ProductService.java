package com.assignment;
import java.util.*;

public class ProductService {
	public static String findNameByCode(int num) {

		for (int i = 0; i < ProductRepo.arr.length; i++) {

		if (ProductRepo.arr[i].getProductcode() == num) {

		return ProductRepo.arr[i].getName();

		}

		}

		return"null";

		}



		public static Product findMaxPriceProduct(String category) {

		double maxPrice = Double.MIN_VALUE;

		int index = -1;

		for (int i = 0; i < ProductRepo.arr.length; i++) {



		if (ProductRepo.arr[i].getCategory().equals(category) && ProductRepo.arr[i].getPrice() > maxPrice) {



		maxPrice = ProductRepo.arr[i].getPrice();

		index = i;

		}

		}

		if (index == -1) {

		return null;

		} else {

		return ProductRepo.arr[index];

		}

		}



		public static Product[] getProductsByCategory(String category) {

		ArrayList<Product> list=new ArrayList<Product>();



		for(int i=0; i<ProductRepo.arr.length; i++) {

		if(ProductRepo.arr[i].getCategory().equals(category)) {

		list.add(ProductRepo.arr[i]);

		}

		}

		if(list.isEmpty()) {

		return null;

		}

		else {

		Product[] arr=list.toArray(new Product[list.size()]);

		return arr;

		}





		}



		}
    
    

