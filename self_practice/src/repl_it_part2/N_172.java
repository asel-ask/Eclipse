package repl_it_part2;
import java.util.*;
public class N_172 {

	public static void main(String[] args) {
		 
	 

		 
		    Scanner scan = new Scanner(System.in);
		    int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},
		                              {scan.nextInt(), scan.nextInt(), scan.nextInt()},
		                              {scan.nextInt(), scan.nextInt(), scan.nextInt()}
		                            };
		    int result = 0;
		    int result1=matrix[0][0]+matrix[1][1]+matrix[2][2];
		    int result2=matrix[0][2]+matrix[1][1]+matrix[2][0];
		    result=result2-result1;
		    
		    
		    
		    // FINAL PRINT
		    System.out.println(Math.abs(result));
	
		    
		    
		    
	}
		

}
