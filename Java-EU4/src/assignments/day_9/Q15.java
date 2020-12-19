package assignments.day_9;

public class Q15 {

	public static void main(String[] args) {
		
		String str="catdog";
		
		String s1="cat";
		String s2="dog";
		
		int cat=0;
		int dog=0;
		
		
		for(int i=0;i<str.length()-2;i++) {
			
			
			
			if(str.substring(i,3).equals(s1)) {
				cat++;
			}if(str.substring(i,3).equals(s2)) {
				dog++;
			}
		}
			System.out.println(cat==dog);
		
	}
}
