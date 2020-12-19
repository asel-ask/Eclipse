package a_reviiew.Week10;

import java.text.DecimalFormat;

public class ArraysPractice1 {

public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int countEven = 0;
		int countOdd = 0;
		
		for(int i = 0; i <=arr.length-1; i++ ) {
			if(arr[i] % 2 ==0 ) {
				countEven++;
			}else {
				countOdd++;
			}
		}
		
		System.out.println("Even Numbers: "+countEven);
		System.out.println("Odd Numbers: "+countOdd);
		
		System.out.println("======================================");
		int [] numbers= {10,20,5,4,3,2,1,30,45};
		int max=numbers[0];
		int min=numbers[0];
		int  sum=0;
		
		for(int each : numbers) {
			max=Math.max(each, max);
			min=Math.max(each, min);
			sum +=each;
		}
		
		double average=(double)sum/numbers.length;
		
		DecimalFormat df=new DecimalFormat("0.00");
		
		System.out.println("Average number is: "+df.format(average));
		System.out.println("Max Number: "+max);
		System.out.println("Min Number: "+min);
	}
	

}
