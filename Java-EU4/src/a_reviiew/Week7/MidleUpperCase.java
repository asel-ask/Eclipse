package a_reviiew.Week7;

public class MidleUpperCase {

	public static void main(String[] args) {

		
		System.out.println(makeMiddleCapital("shows"));
		System.out.println(makeMiddleCapital("banana"));

	}
	public static String makeMiddleCapital(String str) {
		String word="";
		str=str.toLowerCase();
		if(str.length()%2==1) {
			
			String front=str.substring(0,str.length()/2);
			String middle=""+str.charAt(str.length()/2);
			String last =str.substring(str.length()/2+1);
		word=front+middle.toUpperCase()+last;
		return word;
		} 
		String front=str.substring(0,str.length()/2-1);
		String middle=str.substring(str.length()/2-1,str.length()/2+1);
		String last =str.substring(str.length()/2+1);
		word=front+middle.toUpperCase()+last;
		return word;
		
		 
	}
}
