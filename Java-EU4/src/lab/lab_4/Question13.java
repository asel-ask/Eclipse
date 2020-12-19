package lab.lab_4;

import java.util.Arrays;

public class Question13 {

	public static void main(String[] args) {
		 
		int[] x = {1,2};
		int[] y = {3,4};
		largest(x, y);
		int[] x1 = {5,6};
		int[] y1= {3,8};
		largest(x1, y1);
		int[] x2 = {1,1};
		int[] y2 = {1,0};
		largest(x2, y2);

	}
	public static void largest(int [] arr1, int[] arr2) {
		int sum1=0;
		int sum2=0;
		for(int value : arr1) {
			sum1+=value;
		}
		for(int value : arr2) {
			sum2+=value;
		}
		
		if(sum1>sum2) {
			System.out.println(Arrays.toString(arr1));
		}else if(sum2>sum1) {
			System.out.println(Arrays.toString(arr2));
		}else 
			System.out.println("equal ");
		
	}
}
