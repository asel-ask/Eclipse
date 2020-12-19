package lab.lab_4;

public class Question10 {

	public static void main(String[] args) {
		 
		int[] x = {2,2}; 
		int[] y = {3,3};
		int[] a = {2,3}; 
		int[] b = {12,20,42}; 
		int[] c = {2,2,2}; 
		
		System.out.println(twiceNum(x));
		System.out.println(twiceNum(y));
		System.out.println(twiceNum(a));
		System.out.println(twiceNum(b));
		System.out.println(twiceNum(c));
		

	}
	public static boolean twiceNum(int [] arr) {
		int count2=0;
		int count3=0;
		for(int value : arr) {
			if(value==2) {
				count2++;
			}else if(value==3) {
				count3++;
			} 
		}
		if(count2==2 || count3==2) {
			return true;
		}else
		return false;
	}
}
