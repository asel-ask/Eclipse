package repl_it;
import java.util.Scanner;

public class Email1_76 {

	public static void main(String[] args) {
		 
		 
		    Scanner scan = new Scanner(System.in);
		    String email = scan.next();
		    
		    if(!email.contains("_")){
		     System.out.println(email);
		     
		    }else {
		    	//mike_tyson@gmail.com
		    	String firstName=email.substring(0, email.indexOf("_"));
		    	String lastName=email.substring(email.indexOf("_")+1,email.indexOf("@"));
		    	email=lastName.concat("_").concat(firstName).concat("@gmail.com");
		    	System.out.println(email);
		    	
		    }
		    
//		    for (int i=0;i<email.length()-10;i++) {
//		    	if(email.charAt(i)=='_') {
//		    		System.out.println(email.substring(i+1,email.indexOf("@")).concat("_")
//		    				.concat(email.substring(0,i)).concat(email.substring(email.length()-10)));
//		    		return;
//		    	}else if(!(email.charAt(i)=='_')){
//		    		System.out.println(email);
//		    	}
//		    }
		    
		    
		    
		  
		

	}

}
