package a_reviiew.Week9;

import java.util.ArrayList;
import java.util.Arrays;

public class CamelCase {

	public static void main(String[] args) {
		
		String [] arr= {"java is fun", "Lets go to park"};
		ArrayList<String> list=new ArrayList<>(Arrays.asList(arr));
		System.out.println(makeCamelCase(list));
		
		
	}
	
	public static ArrayList<String> makeCamelCase(ArrayList<String> words){
		
		 ArrayList<String>camelCaseWords=new ArrayList<>();
		 
		 for( String word : words) {
			 
			 String [] eachWord=word.toLowerCase().split(" ");
			 
			 String camelWord=eachWord[0];
			 
			 for(int j=1;j<eachWord.length;j++) {
				 String firstLetter = eachWord[j].substring(0,1).toUpperCase();
				 camelWord += firstLetter+eachWord[j].substring(1);
			 }
			 camelCaseWords.add(camelWord);
		 }
		 return camelCaseWords;
		
		
	}
}
