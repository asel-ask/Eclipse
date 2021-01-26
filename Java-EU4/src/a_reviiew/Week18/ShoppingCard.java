package a_reviiew.Week18;

import java.util.Stack;

class Item{
	String name;
	double price;
	public Item(String name, double price) {
		this.name=name;
		this.price=price;
	}
	
}

public class ShoppingCard {

	public static void main(String[] args) {
		Stack<Item>allItems=new Stack<>();
		allItems.add(new Item("apple",2.5));
		allItems.add(new Item("orange",3));
		allItems.add(new Item("mango",2.1));
		
		System.out.println(allItems.peek());
		
	}
	
}
