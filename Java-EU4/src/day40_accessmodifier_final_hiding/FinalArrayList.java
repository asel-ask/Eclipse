package day40_accessmodifier_final_hiding;

import java.util.ArrayList;

public class FinalArrayList {

	public static void main(String[] args) {
		
		final ArrayList<String>COLORS=new ArrayList<>();
		COLORS.add("Orange");
		COLORS.add("Apple");
		COLORS.remove(0);
		
		//COLORS = new ArrayList<String>();
	}
}
