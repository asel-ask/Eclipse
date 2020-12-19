package repl_it_part2;

public class Utils {

	public static String reverseLetters(String str) {
		
		String s=str.charAt(0)+"";
		for(int i=0;i<str.length();i++) {
			
			if(Character.isAlphabetic(str.charAt(i))) {
				s=str.charAt(i+1)+"";
			}
		}	for(int i=s.length()-1;i>=0;i--) {
			s+=s.charAt(i)+"";
		} return s;
	}
	
	
}
