package a_reviiew.Week10;

public class StringPractice5 {

	public static void main(String[] args) {
		
		String str="aaabbbbcaca";
		
		int count=0;
		
		for(String each : str.split("")) {
			if(each.equals("a")) {
				count++;
			}
		}
		System.out.println(count);
	}
}
