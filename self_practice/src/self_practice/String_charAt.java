package self_practice;

public class String_charAt {

	public static void main(String[] args) {
			
		String word="Computer";
		System.out.println(word.length());
		
		for(int i=0;i<word.length();i++) {
			System.out.println(word.charAt(i));
		}
		
		String word2="Apple";
		System.out.println(word2.charAt(0)=='A');
		
		String word3="civic";
		if(word3.charAt(0)==word3.charAt(word3.length()-1)) {
			System.out.println("First and last chars are same");
		}else 
			System.out.println("First and last chars are not same");
		
		String word4="Cybertek School";
		for(int i=0;i<word4.length();i++) {
			System.out.println(word4.charAt(i));
		}
	}

}
