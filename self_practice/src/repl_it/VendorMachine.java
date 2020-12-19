package repl_it;
import java.util.*;
public class VendorMachine {

	public static void main(String[] args) {
		 

		
		    //ENTER CODE HERE
		System.out.println("Enter price in cents:");
		    int itemPrice, quarters, dimes, nickels,change;
		    Scanner scan=new Scanner(System.in);
		    itemPrice=scan.nextInt();
		    change=100-itemPrice;
			quarters=change/25;
			change=change%25;
			dimes=change/10;
			change=change%10;
			nickels=change/5;
			change=change%5;
		    
		    if(itemPrice>25 && itemPrice<100 && itemPrice%5==0){
		    System.out.println("Your change is "+quarters+" quarters, "+dimes+" dimes, and "+nickels+" nickels.");
		    }else if(itemPrice<25 || itemPrice>100){
		      System.out.println("Invalid price!");
		       } else {
		      System.out.println("Invalid price!");}
		     
		  }
		
	}


