package day19_stringManipulation_1;

public class Task78_NumberOfOccurrences {

	public static void main(String[] args) {


		String word="abcabsdabs";
		char myChar='d';
		int count=0;
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)==myChar) {
				count++;
				 
			} 
		} 
		System.out.println("Count for "+myChar+" is "+count);

	}

}
