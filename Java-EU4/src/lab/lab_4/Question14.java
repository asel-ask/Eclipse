package lab.lab_4;

import java.util.Arrays;

public class Question14 {

	public static void main(String[] args) {
		 
		int[] x = {1,2};
		int[] y = {3,4};
		System.out.println(Arrays.toString(newArray(x, y)));
		int[] x1 = {4,4};
		int[] y1= {2,2};
		System.out.println(Arrays.toString(newArray(x1, y1)));
		int[] x2 = {9,2};
		int[] y2 = {3,4};
		System.out.println(Arrays.toString(newArray(x2, y2)));
		
	}
	
	public static int[] newArray(int[] arr1, int [] arr2) {
		
		int arr3[]=new int [arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++) {
			arr3[i]+=arr1[i];
		}
		int a=0;
		for(int i=arr1.length;i<arr3.length;i++) {
			arr3[i]+=arr2[a];
			a++;
		}
		
			return arr3;
	}
}
