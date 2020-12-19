package repl_it_part2;
import java.util.*;
public class N_159_UniqueNumber {

	public static void main(String[] args) {
		 

		
		    Scanner scan = new Scanner(System.in);
		    int size = scan.nextInt();
		    int[] nums = new int[size];
		    for(int i=0; i < size; i++){
		      nums[i] = scan.nextInt();
		    }
		    printUniqueNumbers(nums);
		  }
		  
		  public static void printUniqueNumbers(int[] nums){
		    //WRITE YOUR CODE HERE
			  for(int i=0;i<nums.length;i++){
			      if(nums[i]==nums[i]){
			        
			      }else
			    	  System.out.println(nums[i]);
		   
			  }
		  }

	

}
