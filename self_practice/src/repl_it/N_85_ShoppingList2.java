package repl_it;
import java.util.Scanner;

public class N_85_ShoppingList2 {
	 
	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
			String shoppingListReport = "";
			String item = "";
			String countinue = "";
			double price = 0;
			int count = 1;
			double totalPrice = 0;
			do{
			  System.out.println("Enter item"+count+" and its price: ");
			  item=scan.next();
			  price=scan.nextDouble();
			  totalPrice+=price;
			  shoppingListReport+="Item"+count+": "+item+" Price: "+price+" "	;
			  System.out.print("Add one more item?");
			  countinue=scan.next();
			  if(countinue.equalsIgnoreCase("yes")){
			    count++;
			     
			  }else {
				  break;
			  }
			  
			     
			}while(count>0);
			
			System.out.println(shoppingListReport);
			System.out.println(totalPrice);
	  }
	}

