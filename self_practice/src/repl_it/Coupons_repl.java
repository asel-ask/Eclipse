package repl_it;
import java.util.*;
public class Coupons_repl {

	public static void main(String[] args) {
		 

		
		    //Write your code here
		    Scanner scan=new Scanner(System.in);
		    System.out.println("Enter number of coupons:");
		    int coupons=scan.nextInt();
		    int candybar=coupons/10;
		    int gumball=coupons%10/3;
		    if(coupons<10 && coupons>3){
		      System.out.println("Number of Candies: "+candybar);
		      System.out.println("Number of Gumballs: "+gumball);
		      
		    }else if(coupons>=10){
		    System.out.println("Number of Candies: "+candybar);
		    System.out.println("Number of Gumballs: "+gumball);
		    }else {
		      System.out.println("Not enough coupons");
		    }
		  }
		

	}


