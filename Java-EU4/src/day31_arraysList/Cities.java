package day31_arraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class Cities {

	public static void main(String[] args) {
		
		ArrayList <String> cities=new ArrayList<>();;
		
		cities.add("London");
		cities.add("Virginia");
		cities.add("DC");
		cities.add("Baku");
		cities.add("Berlin");
		cities.add("Baku");
		
		System.out.println(cities.toString());
		
		//Print each city by using for each loop separated by space
		
		for(String value: cities) {
			
			System.out.print(value+" ");
			
		}
		
		//Print each city by using for iterator loop separated by space
		
		for(int i=0;i<cities.size();i++) {
			
			System.out.println(cities.get(i));
		
		}
		
		System.out.println("Removing Baku");
		cities.remove("Baku");
		cities.remove("New York");
		System.out.println(cities.toString());
		
		System.out.println("-----------------");
		
		cities.add(0,"Arlington");
		cities.add(1,"Istanbul");
		System.out.println(cities.toString());
		
		cities.add(2,"Ankara");
		System.out.println(cities.toString());
		
		System.out.println("-------------------------");
		
		
		int indx=cities.indexOf("Istanbul");
		System.out.println(indx);
		
		System.out.println(cities.indexOf("Bursa")); // will return -1 if element does not exist in arrayList
		
		System.out.println("---------------------------");
		
		cities.clear();
		boolean empty=cities.isEmpty();
		System.out.println(empty);
		
		
		
		
	}
}
