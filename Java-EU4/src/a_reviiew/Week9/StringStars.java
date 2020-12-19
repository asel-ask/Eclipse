package a_reviiew.Week9;
import java.util.*;

public class StringStars {

	public static void main(String[] args) {
		String [] str= {"one","hi","hold","start"};
		
		ArrayList<String> list=new ArrayList<>();
		list.addAll(Arrays.asList(str));
		
		System.out.println(makeStars(list));
	}
	
	public static ArrayList<String> makeStars(ArrayList<String> words){
		
		ArrayList<String> stars=new ArrayList<>();
		
		for(String word : words) {
			
			String eachStar="";
			
			for(int i=0; i<word.length();i++) {
				eachStar+="*";
				
			}
			stars.add(eachStar);
		}
		return stars;
	}
}
