package repl_it_part2;
import java.util.*;
public class N_119 {

	public static void main(String[] args) {

		 

		 
		    Scanner input = new Scanner(System.in);
		    String email = input.nextLine();
		    
		    //Write your code below
		    int count=0;
		    for(int i=0;i<email.length();i++) {
		      if(email.charAt(i)=='@'){
		        count++;
		      }
		      }
		   System.out.println(count);
		   if(count>1 || count<1){
		      System.out.println("invalid email");
		     return;
		    }
		    
		    if (count==1){
		      String [] arr=email.split("@");
		      System.out.println("Email id: "+arr[0]);
		      System.out.println("Email domain: "+arr[1]);
		      
		    }
		  
	}

}
