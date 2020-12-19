package a_reviiew.Week10;

import java.util.Arrays;

public class ArraysPractice3 {

	public static void main(String[] args) {
		
		String s1="Silent".toLowerCase();
		String s2="Listen".toLowerCase();

		char [] ch1=s1.toCharArray();
		char [] ch2=s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		boolean isAnagram=Arrays.equals(ch1, ch2);
		System.out.println(isAnagram);
		
		
	}
}
