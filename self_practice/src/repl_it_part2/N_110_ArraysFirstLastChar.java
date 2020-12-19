package repl_it_part2;
import java.util.*;
public class N_110_ArraysFirstLastChar {

	public static void main(String[] args) {

	 
	
	
	    
	    Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	   
	    // leave above code alone :)
	    // assume you have String array of 5 items 
	    //and print firt and last char of each items in one line
	    
	    //TODO: Write your code below
	    for(int i=0; i<5; i++ ){
	      System.out.print(words[i].charAt(0));
	      System.out.println(words[i].charAt(words[i].length()-1));
	      
	    }
	    
	  

	}

}
