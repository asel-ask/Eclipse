package repl_it_part2;
import java.util.*;
public class N_143_2DArrays {

	public static void main(String[] args) {

		 

		 
		    int [][] multiplicationTable = new int[10][10];
		    
		    //TODO: type your code below
		   
		    for(int i=0;i<multiplicationTable.length;i++) {
		    	 for(int j=0;j<multiplicationTable.length;j++) {
		    	 
		    	 multiplicationTable[i][j]=(i+1)*(j+1);
		    	 
		    	 }
		  }
		    
		    	 
		    
		    
		   
		    
		    
		    //Do not modify below line it will be used to test your code. And 
		    //Can be used by you while developing your code
		    System.out.println(Arrays.deepToString(multiplicationTable) ) ;
		
		    
		    

	}

}
