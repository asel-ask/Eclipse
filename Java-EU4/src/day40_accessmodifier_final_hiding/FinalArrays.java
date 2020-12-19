package day40_accessmodifier_final_hiding;

public class FinalArrays {

	public static void main(String[] args) {
		
		final int[] TEAMS= {11,11};
		System.out.println(TEAMS[0]);
		
		TEAMS[0]=15;
		System.out.println(TEAMS[0]);
		
		int[] num=new int[] {1,2,3};
		num=new int [] {4,5,6};
		
		final int [] finalNum=new int[] {10,20,30};
		finalNum[0]=120;
		
		//finalNum=new int[] {40,50,60}; error
		
	}

}
