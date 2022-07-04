package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("HD case", 80.90));

		List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
	
		names.forEach(System.out::println);
		
	
	}

}
