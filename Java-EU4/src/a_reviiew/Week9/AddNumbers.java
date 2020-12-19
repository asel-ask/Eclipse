package a_reviiew.Week9;

import java.util.ArrayList;

public class AddNumbers {

	public static void main(String[] args) {
		
		ArrayList<String> nums=new ArrayList<>();
		nums.add("123");
		nums.add("421");
		nums.add("4032");
		
		System.out.println(sumofEachString(nums));
		
	}
	
	public static ArrayList<Integer> sumofEachString(ArrayList<String> nums){
		
		ArrayList<Integer> sums=new ArrayList<>();
		for(int i=0;i<nums.size();i++) {
			
			int sum=0;
			
			for(int j=0;j<nums.get(i).length();j++) {
				
				sum += Integer.parseInt(nums.get(i).substring(j,j+1));
				//sum += Integer.parseInt(""+nums.get(i).charAt(j));
			}
			sums.add(sum);
		}
		
		return sums;
	}
}
