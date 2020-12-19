package a_reviiew.Week10;

public class StringPractice6 {

	public static void main(String[] args) {
		
		String str="ababaaac";
		String uniques="";
		
		
		for(int i=0; i<str.length();i++) {
		
		char ch= str.charAt(i);
		int count=0;
		
		for(char each : str.toCharArray()) {
			if(each==ch) {
				count++;
			}
		}
		if(count==1) {
			uniques+=ch;
		}
		}
		System.out.println(uniques);
	}
}
