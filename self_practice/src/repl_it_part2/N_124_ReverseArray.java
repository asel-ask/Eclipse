package repl_it_part2;
import java.util.*;
public class N_124_ReverseArray {

	public static void main(String[] args) {
		 

		 
		    Scanner input = new Scanner(System.in);
		    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		    
		    //TODO: write your code below

		    int temp = nums[0];
		    nums[0] = nums[6];
		    nums[6] = temp;
		    temp=nums[0+1];
		    nums[0+1]=nums[6-1];
		    nums[6-1]=temp;
		    temp=nums[0+2];
		    nums[0+2]=nums[6-2];
		    nums[6-2]=temp;
		    
		    
		    //Do not change below statement:
		    System.out.println(Arrays.toString(nums));
		    
		    
		  
	}

}
