package repl_it;
import java.util.Scanner;
public class Email2_77 {

	public static void main(String[] args) {
		 

	
		    Scanner scan = new Scanner(System.in);
		    String email = scan.next();
		    String firstName,lastName,domain,domainLevel;
		    
		    firstName=email.substring(0,email.indexOf("_")).replace(email.substring(0,1),email.substring
		    		(0,1).toUpperCase());
		    
		    lastName=email.substring(email.indexOf("_")+1,email.indexOf("@")).replace(email.substring
		    (email.indexOf("_")+1,email.indexOf("_")+2),email.substring(email.indexOf("_")+1,email.indexOf("_")+2)
		    .toUpperCase());
		    
		    domain=email.substring(email.indexOf("@")+1,email.indexOf("."));
		    domainLevel=email.substring(email.indexOf(".")+1);
		    System.out.println("First name: "+firstName+"\nLast name: "+
		                  lastName+"\nDomain: "+domain+"\nTop-Level Domain: "+domainLevel);
		    
		    
		    
		  
		

	}

}
