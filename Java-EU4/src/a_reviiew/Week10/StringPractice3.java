package a_reviiew.Week10;

public class StringPractice3 {

	public static void main(String[] args) {
		
		
		String str="aaaaaaabbbbbbbaaaaacccccccccdddddddd";
		
		String result="";
		
		for(String each : str.split("")) {
			if(!result.contains(each)) {
				result+=each;
			}
		}
		
		System.out.println(result);
		
		
	}
}
