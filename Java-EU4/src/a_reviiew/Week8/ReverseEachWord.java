package a_reviiew.Week8;

public class ReverseEachWord {

	public static void main(String[] args) {

		String str="I love learning java";
		System.out.println(reverseEachWord(str));

	}
	public static String reverseEachWord(String str) {
		
		String [] words=str.split(" ");
		
		String reverse="";
		
		for(String word : words) {
			
			String reverseEach="";
			
			for(int i=word.length()-1; i>=0; i--) {
				reverseEach+=word.charAt(i);
			}
			reverse+=reverseEach+" ";
		}
		 return reverse.trim();
		
	}
}
