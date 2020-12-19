package repl_it;
import java.util.Scanner;
public class Without_X_or_x {

	public static void main(String[] args) {
		 

		
		    Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    
		     for(int i=0;i<word.length();i++) {
		    	 if(word.charAt(i)=='x' || word.charAt(i)=='X') {
		    		 word=word.replace('x', ' ');
		    	 }
		     }
		     System.out.println(word);
		     
	}

}
