package a_reviiew.Week9;

import java.util.ArrayList;

public class MergeArrays_ReturnArrayList {

	public static void main(String[] args) {
		
		int [] arr1= {1,2,5,9,8};
		int [] arr2= {4,5,6,7};
		System.out.println(mergeArrays(arr1, arr2));
		
	}
	public static ArrayList<Integer> mergeArrays(int[] one, int[] two){
		
		ArrayList<Integer>mergeNums=new ArrayList<>();
		
		int max=Math.max(one.length, two.length);
		
		for(int i=0; i<max;i++) {
			
			if(i<one.length) {
			mergeNums.add(one[i]);
			}
			if(i<two.length) {
			mergeNums.add(two[i]);
			}
		}
		
		return mergeNums;
	}
}
