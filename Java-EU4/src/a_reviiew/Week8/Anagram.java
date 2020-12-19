package a_reviiew.Week8;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		//listen 
		//silent
		
		System.out.println(isAnagram("listen","silent"));
		
		
	}
	
	public static boolean isAnagram(String one,String two) {
		
		if(one.length() != two.length()) {
			return false;
		}
		int [] count=new int[26];
		
		for(int i=0;i<one.length();i++) {
			
			char cOne=one.charAt(i);
			char cTwo=two.charAt(i);
			
			//count[0]=count[0]+1;
			
			count[cOne-97]=count[cOne-97]+1;
			count[cTwo-97]=count[cTwo-97]-1;
		
		}
			return Arrays.equals(count, new int[26]);
		
		
	}
}
