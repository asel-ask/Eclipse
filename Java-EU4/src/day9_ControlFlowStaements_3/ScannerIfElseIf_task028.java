package day9_ControlFlowStaements_3;
import java.util.*;
public class ScannerIfElseIf_task028 {

	public static void main(String[] args) {
		

		
		    //WRITE YOUR CODE HERE
		    
		    //Step 1. Create object of Scanner class
		   
		    //Step 2. Create and initialize in variable day. Use scanner.nextInt() to intitialize.
		  
		    //Step 3. Write an if statement
		    Scanner scanner=new Scanner(System.in);
		    int day=scanner.nextInt();
		    if(day==1){
		      System.out.println("It's a Monday!");
		    }else if(day==2){
		      System.out.println("It's a Tuesday!");
		    }else if (day==3){
		      System.out.println("It's a Wednesday!");
		    }else if(day==4){
		      System.out.println("It's a Thursday!");
		    }else if(day==5){
		      System.out.println("It's a Friday!");
		    }else if(day==6){
		      System.out.println("It's a Saturday!");
		    }else if (day==7){
		      System.out.println("It's a Sunday!");
		    }else 
		      System.out.println("There is no such a day!");
		

	}

}
