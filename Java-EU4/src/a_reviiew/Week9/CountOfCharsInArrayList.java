package a_reviiew.Week9;

import java.util.ArrayList;
import java.util.Arrays;

public class CountOfCharsInArrayList {

	public static void main(String[] args) {
		
		String [] str= {"apple","pineapple","mango","watermelon"};
		ArrayList<String> words=new ArrayList<>(Arrays.asList(str));
		System.out.println(Arrays.toString(countChar(words, 'a')));
		System.out.println(countChar2(words, 'e'));
		
	}
	public static int[] countChar(ArrayList<String> words, char letter) {
		
		int[] total=new int [words.size()];
		int index=0;
		for(String word : words) {
			int count=0;
			for(char eachLetter : word.toCharArray()) {
				if(eachLetter==letter) {
					count++;
				}
			}
			total[index++]=count;
		}
			return total;
	}
	public static int countChar2(ArrayList<String> words, char letter) {
		
		int total=0;
	 
		for(String word : words) {
			
			for(char eachLetter : word.toCharArray()) {
				if(eachLetter==letter) {
					total++;
				}
			}
			
		}
			return total;
	}
}
