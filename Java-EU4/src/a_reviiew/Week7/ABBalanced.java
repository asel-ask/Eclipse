package a_reviiew.Week7;

public class ABBalanced {

	public static void main(String[] args) {

		System.out.println(isBalance("abcab"));
		System.out.println(isBalance("bacdf"));
		System.out.println(isBalance("ayeba"));
		 System.out.println(isBalance("aaxxb"));

	}
	public static String isBalance(String s) {
		boolean check=true;
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i)=='a') {
				if(!s.substring(i).contains("b")) {
					return "not balanced";
				}
			}
		}
		
		return "balanced";
	}
}
