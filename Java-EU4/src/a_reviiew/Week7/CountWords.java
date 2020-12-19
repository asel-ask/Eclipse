package a_reviiew.Week7;

public class CountWords {

	public static void main(String[] args) {

		System.out.println(countWord("java,javaScript and css java and database, java", "java"));

	}	
	public static int countWord(String str, String word) {
		int count=0;
		
		while(str.contains(word)) {
			count++;
			str=str.replaceFirst("java", "");
		}
		return count;
	}

}
