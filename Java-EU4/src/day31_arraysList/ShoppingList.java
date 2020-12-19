package day31_arraysList;

import java.util.ArrayList;

public class ShoppingList {

	public static void main(String[] args) {
		
		ArrayList<String> shoppingList=new ArrayList<>();
		
		shoppingList.add("papper towel");
		shoppingList.add("dish soap");
		shoppingList.add("trash bag");
		shoppingList.add("clorox");
		shoppingList.add("gloves");
		shoppingList.add("shovel");
		
		System.out.println(shoppingList.size());
		
		System.out.println(shoppingList.toString());
		
		System.out.println(shoppingList.get(0)+" | "+shoppingList.get(shoppingList.size()-1));
		
		shoppingList.remove("papper towel");
		shoppingList.remove("shovel");
		
		System.out.println(shoppingList.toString());
		System.out.println(shoppingList.get(0)+" | "+shoppingList.get(shoppingList.size()-1));
		
		shoppingList.remove(0);
		System.out.println(shoppingList.toString());
		
		for(String value: shoppingList) {
			System.out.println(value+" ");
		}
		
		shoppingList.clear();
		System.out.println(shoppingList.toString() );
		
	}
}
