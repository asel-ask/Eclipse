package repl_it_part2;
import java.util.*;
public class N_125_ShortestWord {

	public static void main(String[] args) {
		 

		 
		    Scanner scan = new Scanner(System.in);
		    String[] str = {scan.next(), scan.next(), scan.next(), 
		                    scan.next(), scan.next(), scan.next()};
		   
		   String small=str[0];
		   for(int i=0;i<str.length;i++){
		     if(str[i].length()<small.length()){
		       small=str[i];
		       
		     }
		   }
		   System.out.println(small);
		  
	
	}
	
}
