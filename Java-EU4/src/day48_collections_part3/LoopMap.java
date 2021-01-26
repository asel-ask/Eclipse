package day48_collections_part3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import day46_collection_part1.Product;

public class LoopMap {
public static void main(String[] args) {
	  // Keys , Values
	Map<String, String>dataMap=new HashMap<>();
	dataMap.put("url", "qa3.vytrack.com");
	dataMap.put("Username", "User66");
	dataMap.put("browser", "Chrome");
	dataMap.put("truckdriver", "Bob");
	dataMap.put("StoreManager", "John");
	
	//keySet --> returns set with all the keys
	//values --> returns with all the values in the map
	System.out.println("++++KEYS++++");
	for(String key : dataMap.keySet()) {
		System.out.println(key);
	}
	System.out.println("++++VAlUES++++");
	for(String value : dataMap.values()) {
		System.out.println(value);
	}
	
	System.out.println("++++ KEY | VALUES ++++");
	for(String key : dataMap.keySet()) {
		System.out.println(key+" | "+dataMap.get(key));
	}
	
	dataMap.forEach((k,v) -> System.out.println(k+"|"+v));
	
	Map<Integer, Product>studentMap=new HashMap<>();
	Map<String, String[]>data=new HashMap<>();
	Map<Integer, List<String>>data2=new HashMap<>();
	Map<Integer, List<String[]>>data3=new HashMap<>();
	Map<String, Map<Integer,Integer>>data4=new HashMap<>();
	Map<String,Map<Integer, Product>>data5=new HashMap<>();
	
	
	
	
	
	
}
}
