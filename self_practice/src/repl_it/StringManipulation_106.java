package repl_it;
import java.util.Scanner;
public class StringManipulation_106 {

	public static void main(String[] args) {
		
		 

		 
		    Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String word = inp.nextLine();
		    //write your code below
		   // for(int i=0; i<word.length(); i++){
//		    	char vowel=(word.charAt(i));
//		      if(vowel=='a'|| vowel=='o' || vowel=='e' || vowel=='u' || vowel=='i') {
//		    	  System.out.print(vowel);
		    	for(int i=0;i<word.length();i++) {
		    		System.out.print("aeiou".contains(word.charAt(i)+"")?word.charAt(i):"");
		    	}
		      }
		      
		      
		    }
		    
		    
		  
		
	


