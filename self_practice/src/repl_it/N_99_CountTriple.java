package repl_it;
import java.util.Scanner;
public class N_99_CountTriple {

	public static void main(String[] args) {
		 

		 
		    Scanner scan = new Scanner(System.in);
		    String str = scan.next();
		    int count = 0 ;
		    //WRITE YOUR CODE HERE
		   for (int i = 0;i<str.length()-2;i++) {
			   if (str.substring(i).charAt(0)==str.substring(i).charAt(1) && str.substring(i).charAt(0)==str.substring(i).charAt(2)) {
			    		count++;
			    	}
			    }System.out.println(count);
		  

	}

}
