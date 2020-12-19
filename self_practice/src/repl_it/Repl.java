package repl_it;
import java.util.Scanner;
public class Repl {

	public static void main(String[] args) {
		 

		 
		    Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    if(word.substring(0,1).equalsIgnoreCase("x")
		    && word.substring(word.length()-1).equalsIgnoreCase("x")){
		    	 System.out.println(word.replace("X", ""));
		    }else 
		      System.out.println(word);
		  
		

	}

}
