package day32_arrayListCount;

import java.util.Scanner;

public class GroceryListMain {
	
	static GroceryList groceryList=new GroceryList();
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		boolean quit=false;
		int press=0;
		printInstruction();
		
		while (!quit) {
			System.out.print("Enter option");
		    press=sc.nextInt();

		    switch (press) {
			case 0: 
				printInstruction();
				break;
			case 1:
				groceryList.printGroceryList();
				break;
			case 2:
				addItem();
				break;
			case 3:
				modifyItem();
				break;
			case 4:
				removeItem();
				break;
			case 5:
				searchItem();
				break;
			case 6:
				quit=true;
				break;
		
		    }
		
		}
	}
	

	public static void printInstruction() {
		
		System.out.println("\nPress");
		System.out.println("\t 0 - To print choice options.");
		System.out.println("\t 1 - To print the list of grocery items.");
		System.out.println("\t 2 - To add an item to the list.");
		System.out.println("\t 3 - To modify an item in the list.");
		System.out.println("\t 4 - To remove an item from the list.");
		System.out.println("\t 5 - To search an item from the list.");
		System.out.println("\t 6 - To quit the application.");
		
	}
	
	public  static void addItem() {
		 
		System.out.println("Enter your grocery item: ");
		sc.nextLine();
		groceryList.addGroceryListItem(sc.nextLine());
	}
	
	public static void modifyItem() {
		System.out.println("Enter item number: ");
		int itemNo=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter replacement item:");
		String newItem=sc.nextLine();
		groceryList.modifyGroceryItem(itemNo-1,newItem);
	}
	
	public static void removeItem() {
		System.out.println("Enter item #:");
		int itemNo=sc.nextInt();
		sc.nextLine();
		groceryList.removeGroceryItem(itemNo-1);
	}
	
	public static void searchItem() {
		System.out.println("Item to search for: ");
		String searchItem=sc.nextLine();
		if(groceryList.findItem(searchItem) != null) {
			System.out.println("Found"+searchItem+" in your grocery list");
		}else {
			System.out.println(searchItem+" is not in the grocery list");
		}
	}
		
}
