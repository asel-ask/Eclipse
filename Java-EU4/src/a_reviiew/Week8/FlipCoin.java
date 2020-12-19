package a_reviiew.Week8;

import java.util.Arrays;
import java.util.Random;

public class FlipCoin {
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(flipCoins(10)));
		
		
	}
	
	public static String [] flipCoins(int numofFlips) {
		Random rn=new Random();
		
		String [] results=new String[numofFlips];
		
		for(int i=0;i<numofFlips;i++) {
			int number=rn.nextInt(2);
			if(number==0) {
				results[i]="H";
			}else
				results[i]="T";
		}
		
			return results;
		
	}
	
}
