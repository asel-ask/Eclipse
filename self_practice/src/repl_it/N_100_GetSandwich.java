package repl_it;
import java.util.Scanner;
public class N_100_GetSandwich {

	public static void main(String[] args) {
		 
		     Scanner scan = new Scanner(System.in);
		     String str = scan.next();
		    
		     if(str.contains("bread")) {
		    	 int firstIndex=str.indexOf("bread");
			     int lastIndex=str.lastIndexOf("bread");
			      
			     if(firstIndex==lastIndex) {
			    	 System.out.println("nothing");
			     }else {
			    	 String middle=str.substring(firstIndex+5,lastIndex);
			    	 System.out.println(middle);
			     }
			     
			     
		     }else {
		    	 System.out.println("nothing");
		     }
		     
		    

	}

}
