package repl_it_part2;
import java.util.*;
public class N_122_FindDublicate {

	public static void main(String[] args) {


	 
	
	 
	    Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	    //TODO: write your code below
	    
	    for(int value : nums){
	        int count=0;
	       for(int i=0;i<nums.length;i++) {
	    	   if(value==nums[i]) {
	    		   count++;
	    	   }
	       }
	       }
	    	
	 

	}

}
