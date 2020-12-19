package a_reviiew.Week8;

import java.util.*;

//pic  -> package, import, class

import java.util.Random;

public class RandomWithArray {
	public static void main(String[] args) {

		
			
			System.out.println(Arrays.toString(generateRandomArray(8)));
		}
		
		public static int [] generateRandomArray(int size) {
			
			Random num = new Random();
			
			int [] arr = new int[size];
			
			for(int i=0; i < size; i++) { // <= length -1 or size -1
				
				arr[i] = num.nextInt(100)+1; // 0 - 99 , adding +1:  1-100
				
			}
				
			return arr;
			
	}
}
