package repl_it;
import java.util.*;
public class SeniorCitizen_repl {

	public static void main(String[] args) {
		 

		
		    //WRITE YOUR CODE HERE 
		    int seniorCitizens, nonSeniorCitizens, age;
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
		    seniorCitizens=sc.nextInt();
		    nonSeniorCitizens=sc.nextInt();
		    System.out.println("What is new citizen's age?");
		    age=sc.nextInt();
		    if(age>=65){
		    System.out.println("Senior Citizen");
		    seniorCitizens+=1;
		    } else if(age<65){
		      System.out.println("Non-Senior Citizen");
		      nonSeniorCitizens+=1;
		    }
		    System.out.println("New seniorCitizens count "+seniorCitizens);
		    System.out.println("New nonSeniorCitizens count "+nonSeniorCitizens);
		    
		    
		    
		  }
		

	}


