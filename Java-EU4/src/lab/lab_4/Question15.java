package lab.lab_4;

import java.util.Arrays;

public class Question15 {

	public static void main(String[] args) {

		int[] x = {1,2,3,4};
		int[] y = {1,2,3};
		int[] z = {8,6,7,9,5};
		
		System.out.println(Arrays.toString(swap(x)));
		System.out.println(Arrays.toString(swap(y)));
		System.out.println(Arrays.toString(swap(z)));
	}

		public static int [] swap(int [] arr) {
			
//			int temp=arr[0];
//			arr[0]=arr[arr.length-1];
//			arr[arr.length-1]=temp;
			
			arr[0]=arr[0]+arr[arr.length-1];
			arr[arr.length-1]=arr[0]-arr[arr.length-1];
			arr[0]=arr[0]-arr[arr.length-1];
			
			return arr;
			
		}
}
