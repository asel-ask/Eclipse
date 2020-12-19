package repl_it_part2;
import java.util.Scanner;
public class N_153_SplitArrays {

	public static void main(String[] args) {

		 
	
		    Scanner inp = new Scanner(System.in);
		    String s = inp.nextLine();
		    person(s) ;
		  }
		  
		   public static void person(String info) 
			{
			
				//your code here
				String [] arr=info.split(" ");
				
				String name=arr[0];
				String lastName=arr[1];
				String age=arr[2];
			  System.out.println("person name: "+name+" last name: "+lastName+" age: "+age);
			}//end person
		  
		

	}


