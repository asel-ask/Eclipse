package lab.lab_3;

public class Q12 {

	public static void main(String[] args) {

		System.out.println(catDog("catdog"));
		System.out.println(catDog("catcat"));
		System.out.println(catDog("1cat1cadodog"));
	}
	public static boolean catDog(String str) {
		
		int countCat = 0,countDog = 0;
		for(int i=0;i<str.length()-2;i++) {
			if(str.substring(i, i+3).equals("cat")) {
				countCat++;
				}else if(str.substring(i, i+3).equals("dog")) {
					 countDog++;
				}
			}
			 if(countCat==countDog) {
				 return true;
			 }else 
				 return false;
		
	
		
	}
}
