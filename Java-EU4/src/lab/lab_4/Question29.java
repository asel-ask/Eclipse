package lab.lab_4;

import java.util.Arrays;

public class Question29 {

	public static void main(String[] args) {
		
		int[] x = {2,10,3,4,20,5,30,5,7};
		System.out.println(Arrays.toString(tenRun(x))); 
		
		int[] y = {10,1,20,2};
		System.out.println(Arrays.toString(tenRun(y)));

	}
	public static int[] tenRun(int [] arr) {
		
		for(int i=0; i<arr.length;i++) {
			if (arr[i]%10==0) {
				for(int j=i+1;j<arr.length && arr[j]%10!=0;j++) {
					arr[j]=arr[i];
				}
				
			}
		}
			return arr;
	}
}
