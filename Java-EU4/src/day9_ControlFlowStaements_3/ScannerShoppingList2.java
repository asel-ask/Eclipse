package day9_ControlFlowStaements_3;
import java.util.Scanner;

public class ScannerShoppingList2 {

	public static void main(String[] args) {
		
		
		    //WRITE YOUR CODE HERE:
		    
		    Scanner scan=new Scanner(System.in);
		    String item1, item2, item3, report;
		    int count1, count2, count3;
		    double price1, price2, price3, totalPrice;
		    System.out.println("Enter Item1, count and its price:");
		    item1=scan.next();
		    count1=scan.nextInt();
		    price1=scan.nextDouble();
		    System.out.println("Enter Item2, count and its price:");
		    item2=scan.next();
		    count2=scan.nextInt();
		    price2=scan.nextDouble();
		    System.out.println("Enter Item3, count and its price:");
		    item3=scan.next();
		    count3=scan.nextInt();
		    price3=scan.nextDouble();
		    
		    report = "Item1: "+item1+" Price: "+price1*count1;
			
			if(count2 != 0) {
				report = report + ", Item2: "+item2+" Price: "+price2*count2;
			}
			if(count3 != 0) {
				report = report + ", Item3: "+item3+" Price: "+price3*count3;
			}
			System.out.println(report);
		    totalPrice=count1*price1+count2*price2+count3*price3;
		    System.out.println("Total price: "+totalPrice);
		    
		   //calculate totalPrice for all items only if the item's count is more than 0!
		   //The unit test assumes that item1 count is always more than 0
		   // The only situations you need to handle are either item2 count is 0 or item3 count is 0. 
		   // Think simple and just handle the only item2 is 0 or  only item3 is 0 branches
		    
		    /*-build the report variable by concatenating Strings and double price values:
 				-do not include items that have count 0, use if statement !
				-Calculate total price for the item and concatenate like below
				"Item1: Tomatoes Price: 10.8, Item3: Apples Price: 31.5"
				Explanation: (Item2 "Cheese" is not included since its count is 0)
					- Print the value of report variable
					- Print total Price:
					"Total price: 42.3" */
		  }
		
	}


