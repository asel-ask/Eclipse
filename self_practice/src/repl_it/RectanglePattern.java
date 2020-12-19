package repl_it;

public class RectanglePattern {

		  public static void printHollowRect()
		  {
			  for (int star = 2; star <= 5; star++){
			   
			    System.out.print("*");}
		   
		  System.out.println("*     *\r\n"); 
		  for(int star = 2; star <= 5; star++){
		  System.out.print("*");
		   
		  }
		  }
		  public static void main(String[] args) {
		   
		    printHollowRect();
		  }
		  
		  
		  
		  
		}


