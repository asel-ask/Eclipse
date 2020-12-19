package a_reviiew.Week9;

import java.util.ArrayList;

public class UpperCaseLowerCase {

	public static void main(String[] args) {
	 
		System.out.println(upperLower("Morning",false));

	}
	public static ArrayList<Character> upperLower(String str, boolean check){
		
		ArrayList<Character>letters=new ArrayList<>(); 
		for(int i=0;i<str.length();i++) {
			char eachChar=str.charAt(i);
		if(check) {
			//upperCase
						  //65				 //90
			if(eachChar >= 'A' && eachChar <= 'Z') {
				letters.add(eachChar);
			}
			
		}else {
			//lowerCase   97-122
			if(Character.isLowerCase(eachChar)) {
				letters.add(eachChar);
			}	
		}
		}
			return letters;
	}
}
