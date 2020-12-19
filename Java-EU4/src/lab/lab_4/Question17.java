package lab.lab_4;

import java.util.Arrays;

public class Question17 {

	public static void main(String[] args) {

		int[] x = {10,3,5,6} ;//7
		int[] y = {7,2,10,9} ;//8
		int[] z = {2,10,7,2}; //8
		
		System.out.println(endsSubstruction(x));
		System.out.println(endsSubstruction(y));
		System.out.println(endsSubstruction(z));
		
	}
		public static int endsSubstruction(int[] arr) {
			int max=arr[0];
			int min=arr[0];
			
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>max) {
					max=arr[i];
				}
				if(arr[i]<min) {
					min=arr[i];
				}
			}
				return max-min;
			
			
		}
}
