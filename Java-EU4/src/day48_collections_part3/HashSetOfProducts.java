package day48_collections_part3;

import java.util.HashSet;
import java.util.Set;

import day46_collection_part1.Product;

public class HashSetOfProducts {

	public static void main(String[] args) {
		
		//create set collection and add new products
		Set <Product>prodSet=new HashSet<>();
		
		prodSet.add(new Product("book",25.99));
		prodSet.add(new Product("book", 17.99));
		prodSet.add(new Product("magazine", 7.99));
		
		System.out.println(prodSet);
		
		prodSet.forEach(p -> System.out.println(p.getName()));
		System.out.println("--------");
		
		for(Product prod : prodSet) {
			System.out.println(prod.getPrice());
		}
	}
}
