package repl_it;
import java.util.Scanner;

public class ShoppingList_2 {

	public static void main(String[] args) {
	 
		 
		    Scanner scan = new Scanner(System.in);
				String shoppingListReport = "";
				String item = "";
				String countinue = "";
				double price = 0;
				int count = 1;
				double totalPrice = 0;
				do{
				  System.out.println("Enter "+item+count+" and its price: ");
				  item=scan.next();
				  totalPrice=scan.nextInt();
				  System.out.println("Add one more item?");
				  if(item.equals("yes")){
				    count++;
				    System.out.println("Item1: "+item+" Price: "+price);
				  }else
				    break;
				  
				}while(count>0);
				
	}

}
