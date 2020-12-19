package repl_it;
import java.util.*;
public class N_86_Party {

	public static void main(String[] args) {
		 

		 
		    Scanner input = new Scanner(System.in);

		    
		    // your code 
		    // ----------------------------------
		    String list="";
		    String name="";
		    String yesNo="";
		    int count=1;
		    do{
		    System.out.println("Please enter guest name:");
		    name=input.next();
		    list+=name+",";
		    
		    System.out.println("Do you want to enter new guest name:");
		    yesNo=input.next();
		    if(yesNo.equalsIgnoreCase("yes")){
		      
		      count++;
		    }else {
		    	break;
		    }
		     
		    }while(count>0);
		    System.out.println("Guest's list: "+list.substring(0,list.length()-1));
		    
		    
		    
		    
		    
		    
		    
		  
		

	}

}
