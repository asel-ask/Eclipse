package day24_arrays_part1;

import java.util.Random;

public class Task91_RandomArray {

	public static void main(String[] args) {

		Random rn=new Random();
		
		
		int [] num =new int [10];
		
		for(int i=0;i<10;i++) {
			
			num[i]=rn.nextInt(100);
			System.out.println(num[i]);
		}
		
	}

}
