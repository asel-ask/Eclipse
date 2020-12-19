package lab.lab_3;

public class Q15 {

	public static void main(String[] args) {

		System.out.println(hasBad("badxx"));
		System.out.println(hasBad("xbadxx"));
		System.out.println(hasBad("xxbadxx"));

	}
	public static boolean hasBad(String str) {
		
		 boolean flag=true;
		for(int i=0;i<2;i++) {
			if(str.substring(i,i+3).equals("bad")) {
				flag=true;
				break;
			}else 
				flag=false;
		}
		
		if(flag) {
			return true;
		}else 
			return false;
	}
}
