package repl_it;
import java.util.*;
public class GiftCard_repl {

	public static void main(String[] args) {
		 

		
		    Scanner scan = new Scanner(System.in);
		    String item = scan.nextLine();
		    
		    //WRITE YOUR CODE HERE
		    int giftCard=100;
		    int balance=0;
		    if(item.equals("Smartphone")){
		      System.out.println("Sorry, not enough funds on your gift card!");
		      }else if (item.equals("Laptop")){
		        System.out.println("Sorry, not enough funds on your gift card!");
		      }else if (item.equals("Charger")){
		        System.out.println(" Thank you for your purchase!");
		        balance=giftCard-15;
		        System.out.println("Your current balance is: "+balance+"$");
		      }else if (item.equals("USB cable")){
		        System.out.println(" Thank you for your purchase!");
		        balance=giftCard-10;
		        System.out.println("Your current balance is: "+balance+"$");
		      }else if (item.equals("Headphones")){
		        System.out.println(" Thank you for your purchase!");
		        balance=giftCard-30;
		        System.out.println("Your current balance is: "+balance+"$");
		      }else if (item.equals("Pants")){
		        System.out.println(" Thank you for your purchase!");
		        balance=giftCard-50;
		        System.out.println("Your current balance is: "+balance+"$");
		      }else if (item.equals("Hat")){  
		        System.out.println(" Thank you for your purchase!");
		        balance=giftCard-25;
		        System.out.println("Your current balance is: "+balance+"$");
		      }else if (item.equals("Socks")){  
		        System.out.println(" Thank you for your purchase!");
		        balance=giftCard-5;
		        System.out.println("Your current balance is: "+balance+"$");
		      }else if (item.equals("Blanket")){ 
		        System.out.println(" Thank you for your purchase!");
		        balance=giftCard-60;
		        System.out.println("Your current balance is: "+balance+"$");
		      }else if (item.equals("Pillow")){ 
		        System.out.println(" Thank you for your purchase!");
		         balance=giftCard-40;
		        System.out.println("Your current balance is: "+balance+"$");
		      } else {
		        System.out.println("Invalid item!");
		      }
		        
		        
		        
		        
		        
		  }
		
	}


