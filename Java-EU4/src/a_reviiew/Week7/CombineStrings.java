package a_reviiew.Week7;

public class CombineStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(combineStrings("java", "apple"));
		System.out.println(combineStrings("12345", "abcdf"));
		
	}
	public static String combineStrings(String one, String two) {
		String combine="";
		int biggest=one.length()>two.length() ? one.length(): two.length();
		
		for(int i=0;i<biggest;i++) {
			
			if(i<one.length()) {
				combine+=one.charAt(i);
			   }
			if(i<two.length()) {
				combine+=two.charAt(i);
			}
		}
		
		return combine;
	}
}
