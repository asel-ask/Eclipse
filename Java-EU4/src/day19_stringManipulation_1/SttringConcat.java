package day19_stringManipulation_1;

public class SttringConcat {

	public static void main(String[] args) {

		String word="Java";
		System.out.println(word.concat("+selenium"));
		System.out.println(word.concat(" in eclipse"));
		
		System.out.println(word);
		
		word=word.concat("+Eclipse");
		System.out.println(word);
		
		word=word.concat(" Automation");
		System.out.println(word);
		
		//word=word.concat(123); this will not work
		word+=123;
		System.out.println(word);
		word=word+true;
		System.out.println(word);
		
		
		String word2="Hi";
		word2=word2.concat("-Hey").concat("-how are you").concat("-good");
		System.out.println(word2);
		
	}

}
