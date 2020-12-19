package repl_it;
import java.util.Scanner;
public class N_102 {

	public static void main(String[] args) {
		 

		 
		
		    Scanner scan = new Scanner(System.in);
		    String html = scan.nextLine();
		    int firstIndex=html.indexOf("id=\"");
		    int lastIndex=html.lastIndexOf("\"");
		   
		    if(html.contains("id=")){
		    System.out.println(html.substring(firstIndex+4,lastIndex));
		      
		    }else{
		      System.out.println("Invalid input!");
		      
		    }
		  
		  

	}

}
