package a_reviiew.Week9;

import java.util.ArrayList;
public class GetPositiveNumbers {
	public static void main(String[] args) {
		
		
		
		System.out.println(getPositiveNum(-9,0,-8,4,1,-2,3,-3));
		
	}
	public static ArrayList<Integer> getPositiveNum(int...arr){
		
		ArrayList<Integer> nums=new ArrayList<>();
		for(int value : arr) {
			if(value>=0) {
				nums.add(value);
			}
			
		}
			return nums;
		
	}
}
