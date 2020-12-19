package repl_it;
import java.util.*;

public class VehicleYear {

	public static void main(String[] args) {
		 
		 
		    //WRITE YOUR CODE HERE
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter vehicle's year:");
		   int vehicleYear=sc.nextInt();
		   
		   
		   if(vehicleYear>=1995 && vehicleYear<=1998 || vehicleYear>=2001 && vehicleYear<=2002 || vehicleYear>=2004 && vehicleYear<=2006 || vehicleYear>=2015 && vehicleYear<=2017){
		     System.out.println("Your vehicle needs to be recalled!");
		   }else {
		     System.out.println("Your vehicle is fine, enjoy!");
		   }
		  }
		

	}


