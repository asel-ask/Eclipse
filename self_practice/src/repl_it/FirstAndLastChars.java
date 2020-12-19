package repl_it;
import java.util.Scanner;

public class FirstAndLastChars {

	public static void main(String[] args) {
	 
		 
		    //DO NOT CHANGE
		    Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    //WRITE YOUR CODE HERE
		    
//		   String start=word.substring(0, 1);
//		    String end=word.substring(word.length()-1);
		     
		    //System.out.println(word.substring(0, 1)+word.substring(word.length()-1) );
		    System.out.println(word.charAt(0)+""+word.charAt(word.length()-1));
		    
		  
		

	}

}
