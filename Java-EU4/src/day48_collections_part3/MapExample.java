package day48_collections_part3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {

		List<Integer> item2=new ArrayList<>();
		item2.add(10);
		
		Map<String, Double> item=new HashMap<>();
		item.put("Apple", 3.49);
		item.put("Flowers", 10.99);
		item.put("Egg", 4.99);
		item.put("Milk", 6.0);
		item.put("Cherries", 5.99);
		
		System.out.println(item.size());
		System.out.println(item.toString());
		
		System.out.println(item.isEmpty());
		
		System.out.println(item.get("Apple"));
		System.out.println(item.get("Milk"));
		
		item.remove("Flowers");
		
		System.out.println(item.toString());

		System.out.println("Is Apples there? "+item.containsKey("Apple"));
		System.out.println("Is Flowers there? "+item.containsKey("Flowers"));
		
		item.replace("Egg", 3.5);
		System.out.println("Price of Eggs: "+item.get("Egg"));
	
		item.put("Milk", 2.6);
		System.out.println("Price of Milk: "+item.get("Milk"));
		
		item.replace("Cherries", item.get("Cherries")+2);
		System.out.println("Price of Cherries: "+item.get("Cherries"));
	}

}
