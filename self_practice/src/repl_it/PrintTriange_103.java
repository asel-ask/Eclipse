package repl_it;
import java.util.Scanner;
public class PrintTriange_103 {

	public static void main(String[] args) {

		 
// 
//		    int i = 1;
//				int j = 1;
				Scanner scan = new Scanner(System.in);
				int n = scan.nextInt();
//		     for (;i<=n;i++){
//		       for (;j<=i;j++){
//		    	   System.out.print("*");
//		       }  System.out.println();
//		     }  
		     
		     for(int i=1;i<=n;i++) {
		    	 for (int j=1;j<=i;j++) {
		    		 System.out.print("*");
		    	 }System.out.println();
		     }
	  }
		

	}


