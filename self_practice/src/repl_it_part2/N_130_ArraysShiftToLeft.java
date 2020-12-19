package repl_it_part2;
import java.util.*;
public class N_130_ArraysShiftToLeft {

	public static void main(String[] args) {

		 

		 
		    Scanner scan = new Scanner(System.in);
		    int size = scan.nextInt();
		    int[] nums = new int[size];
		    for(int i = 0; i < size; i++){
		      nums[i] = scan.nextInt();
		    }
		    //WRITE YOUR CODE HERE
		    int x=nums[0];
		    for(int i=0;i<nums.length;i++){
		      nums[i]=nums[i+1];
		    }
		      nums[nums.length-1]=x;
		      
		      System.out.println(Arrays.toString(nums));

		  }
		 

}
