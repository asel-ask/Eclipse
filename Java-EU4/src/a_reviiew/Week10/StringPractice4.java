package a_reviiew.Week10;

public class StringPractice4 {

	public static void main(String[] args) {
		
		String sentence="I love java, Java is cool, jAvA is fun";
		
		sentence=sentence.toLowerCase();
		
		String word="JAVA";
		word=word.toLowerCase();
		
		int count=0;
		while (sentence.contains(word)) {
			
			sentence = sentence.replaceFirst(word, "");
			count++;
		}
		
		System.out.println(count);
	}
}
