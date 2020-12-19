package lab.lab_4;

public class Question8 {

	public static void main(String[] args) {
		
		int[] x = {2,5};
		int[] y = {4,3}; 
		int[] z = {4,5}; 
		System.out.println(contains(x));
		System.out.println(contains(y));
		System.out.println(contains(z));

	}
	public static boolean contains(int [] arr) {
		
		for(int value : arr) {
			if(value==2 || value==3) {
				return true;
			}
		}
		return false;
	}
}
