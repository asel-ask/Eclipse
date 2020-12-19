package lab.lab_4;

import java.util.Arrays;

public class Question23 {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(fizzArray(4)));
		System.out.println(Arrays.toString(fizzArray(1)));
		System.out.println(Arrays.toString(fizzArray(10)));

	}
	public static int[] fizzArray(int num) {
		
		int [] arr=new int[num];
		 
		for(int i=0;i<arr.length;i++) {
			arr[i]=i;
		}
			return arr;
	}
}
