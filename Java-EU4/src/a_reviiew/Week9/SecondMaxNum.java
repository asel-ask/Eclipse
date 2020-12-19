package a_reviiew.Week9;

import java.util.ArrayList;

public class SecondMaxNum {

	public static void main(String[] args) {
		
		ArrayList<Integer>numbers=new ArrayList<>();
		numbers.add(4);
		numbers.add(5);
		numbers.add(-4);
		numbers.add(100);
		numbers.add(10);
		numbers.add(-900);

		System.out.println(getSecondMax(numbers));
	}
	public static int getSecondMax(ArrayList<Integer>numbers) {
		
		int max=Integer.MIN_VALUE;
		int secondMax=Integer.MAX_VALUE;
		
		for(int num : numbers) {
			
			if(num > max) {
				secondMax=max;
				max=num;
			}
			
			if(num > secondMax && num < max) {
				secondMax = num;
			}
		}
			return secondMax;
	}
}
