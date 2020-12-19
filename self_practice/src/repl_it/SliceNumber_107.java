package repl_it;
import java.util.*;
public class SliceNumber_107 {

	public static void main(String[] args) {

		 

		 
		    //DO NOT CHANGE
		    int num, digit1, digit2, digit3, digit4, digit5;
		    //WRITE YOUR CODE HERE
		    Scanner s=new Scanner(System.in);
		    System.out.println("Enter your number:");
		    num=s.nextInt();
		    
		    digit1=num%100000/10000;
		    digit2=(num%10000)/1000;
		    digit3=(num%1000)/100;
		    digit4=(num%100)/10;
		    digit5=num%10;
		    
		    System.out.println(digit1+"\n"+digit2+"\n"+digit3+"\n"+digit4+"\n"+digit5);
		     
		    
		    
//		    while(num>0) {
//		    	
//		    		num/=10;
		    	
		    
		    
		   
		  //  System.out.println(num%10);
		  }
		
	}


