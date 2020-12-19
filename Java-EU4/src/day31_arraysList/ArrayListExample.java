package day31_arraysList;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		
		ArrayList<String> languages=new ArrayList<>();
		
		languages.add("Italian");
		languages.add("Spanish");
		languages.add("Filipino");
		languages.add("Turkish");
		languages.add("Hungarian");
		
		
		System.out.println(languages.size());
		System.out.println(languages.toString());
//		for(int i=0;i<languages.size();i++) {
//			System.out.println(languages.get(i));
//		}
		
		languages.add("Russian");
		System.out.println(languages.toString());
		
		languages.remove(0);
		System.out.println(languages.toString());
		
	
		
		
		
	}
}
