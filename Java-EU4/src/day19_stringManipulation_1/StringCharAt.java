package day19_stringManipulation_1;

public class StringCharAt {

	public static void main(String[] args) {

		String word="Computer";
		
		System.out.println(word.length());
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
		
		
		String word2="Apple";
		if(word2.charAt(0)=='A') {
		System.out.println("A is first character");
		}else 
			System.out.println("A is not first character");
		
		String word3="civic";
		if(word3.charAt(0)==word3.charAt(4)) {
			System.out.println("First and last characters are same");
		}else 
			System.out.println("First and last characters are not same");
		
		//last name not hard coded
		String word4="javascript";
		
		char lastChar=word4.charAt(word4.length()-1);
		System.out.println("Last char of "+word4+" is "+lastChar);
	}

}
