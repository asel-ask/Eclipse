package a_reviiew.Week8;

public class LongestString {

	public static void main(String[] args) {

		String [] str= { "Monday", "Apple", "Banana", "Strawberry", "Lion"};
		System.out.println(findLongestString(str));

	}
	public static String findLongestString(String [] words) {
		
		String longestWord="";
		
		for(String value : words) {
			
			if(value.length()>longestWord.length()) {
				longestWord=value;
			}
			
		}
		
			return longestWord;
		
	}
}
