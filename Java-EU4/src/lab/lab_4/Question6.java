package lab.lab_4;

import java.util.Arrays;

public class Question6 {

	public static void main(String[] args) {

		int[] x = {1,2,3};
		int[] y = {11,5,9}; 
		int[] a = {110,5,98,0,1200,11,-4};
		
		System.out.println(Arrays.toString(greatestNum(x)));
		System.out.println(Arrays.toString(greatestNum(y)));
		System.out.println(Arrays.toString(greatestNum(a)));
		
	}
	public static int[] greatestNum(int [] arr) {
			int greatest=arr[0];
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i+1]>greatest) {
					greatest=arr[i+1];
				}
			} for(int i=0;i<arr.length;i++) {
				arr[i]=greatest;
			}
			
			return arr;
	}
}
