package repl_it;
import java.util.*;

public class FindMidNumber {

	public static void main(String[] args) {
		
		
		 
		
		    //WRITE YOUR CODE HERE
		    
		    Scanner sc =new Scanner(System.in);
		    int num1,num2,num3;
		    
		    System.out.println("Enter first number:");
		    num1=sc.nextInt();
		    System.out.println("Enter second number:");
		    num2=sc.nextInt();
		    System.out.println("Enter third number:");
		    num3=sc.nextInt();
		    if (num1<num2 && num1>num3 || num1<num3 && num1>num2 ){
		      System.out.println("Medium value is: "+num1);
		    }else if(num2<num1 && num2>num3 || num2<num3 && num2>num1){
		       System.out.println("Medium value is: "+num2);
		    }else {
		       System.out.println("Medium value is: "+num3);
		    }
		    
		  }
		

	}


