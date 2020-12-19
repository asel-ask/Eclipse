package repl_it_part2;
import java.util.*;
public class N_174_Arrays {

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
			  for(int eachNum : nums) {
					
					int count=0;
					
					for(int eachInnerNum : nums) {
						
						if(eachNum==eachInnerNum) {
							count++;
						}
					}
						if(count==1) {
							System.out.println(eachNum);
						}
					
				}
		    
		  	
		  }
		  }


