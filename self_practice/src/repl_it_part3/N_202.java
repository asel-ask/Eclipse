package repl_it_part3;
import java.util.ArrayList;
import java.util.Arrays;
public class N_202 {

	public static void main(String[] args) {


		ArrayList<Integer> nums=new ArrayList<>(Arrays.asList(1,2,3,4));
		timesTwo(nums);

	
			}
			//create your method below
			public static void timesTwo(ArrayList<Integer>nums){
				int[]tot=new int[nums.size()];
			  for(int i=0;i<nums.size();i++){
				 tot[i]=nums.get(i)*2;
			   
			  }
			  System.out.println(Arrays.toString(tot));
			}
		

}
