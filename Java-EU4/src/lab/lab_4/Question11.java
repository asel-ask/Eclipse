package lab.lab_4;

import java.util.Arrays;

public class Question11 {

	public static void main(String[] args) {
		 
		int[] x = {1,2,3} ;
		int[] y = {2,3,5} ;
		int[] z = {1,2,1} ;
		int[] v = {11,2,13,3,2};
		System.out.println(Arrays.toString(folowwed3(x)));
		System.out.println(Arrays.toString(folowwed3(y)));
		System.out.println(Arrays.toString(folowwed3(z)));
		System.out.println(Arrays.toString(folowwed3(v)));
		
	}
	public static int[] folowwed3(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==2 && arr[i+1]==3) {
				arr[i+1]=0;
			}
		}	
			return arr;
		
	}
}
