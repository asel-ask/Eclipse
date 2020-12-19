package lab.lab_4;

import java.util.Arrays;

public class Question9 {

	public static void main(String[] args) {
		
		int[] x = {4,5,7,9}; 
		System.out.println(Arrays.toString(doubleElements(x)));

		
	}
	public static int [] doubleElements(int[] arr) {
		int [] arr2=new int[arr.length*2];
		arr2[arr2.length-1]=arr[arr.length-1];
		return arr2;
	}
}
